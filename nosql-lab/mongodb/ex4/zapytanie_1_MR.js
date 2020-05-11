// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

// Weight
mapper = function() {

    if (this.sex && this.weight && this.height) {
    emit(this.sex, {count:1, avg_weight : this.weight, avg_height : this.height});
    };
};

reducer = function(key, values) {
    
    result = {count:0, avg_weight : 0, avg_height : 0};
    values.forEach(function(value) {
        result.count += value.count;
        result.avg_weight += value.avg_weight;
        result.avg_height += value.avg_height;
    });

    return result;
};

finalizer = function(key, reduced){
    reduced.avg_weight = reduced.avg_weight / reduced.count;
    reduced.avg_height = reduced.avg_height / reduced.count;
    return {avg_weight : reduced.avg_weight, avg_height : reduced.avg_height};
};

res = db.people.mapReduce(mapper, reducer, {
                                            out : {inline : 1},
                                            finalize: finalizer
                                            });
printjson(res);
