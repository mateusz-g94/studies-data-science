// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

mapper = function() {

    var bmi = this.weight / Math.pow(this.height / 100, 2);

    if (!Number.isNaN(bmi) && this.nationality ) {

        emit(this.nationality, {count: 1, avg: bmi, min : bmi, max : bmi});
    };
};

reducer = function(key, values) {

    result = {count : 0, avg : 0, min : values[0].min, max: values[0].max};
    values.forEach(function(value){
        result.count += value.count;
        result.avg += value.avg;
        if (value.min < result.min){
            result.min = value.min;
        };
        if (value.max > result.max){
            result.max = value.max;
        };
    });

    return result;

};

finalizer = function(key, reduced){
    reduced.avg = reduced.avg / reduced.count;
    return {avg_bmi:reduced.avg, min_bmi:reduced.min, max_bmi:reduced.max};
};


res = db.people.mapReduce(mapper, reducer, {
                                            out : {inline : 1},
                                            finalize: finalizer
                                            });
printjson(res);
