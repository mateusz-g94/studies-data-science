// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

mapper = function() {

    emit(this.job, 1);
};

reducer = function(key, values) {

    return Array.sum(values);
};

finalizer = function(key, reduced){
    return {}
}

res = db.people.mapReduce(mapper, reducer, {
                                        out : {inline : 1},
                                        finalize: finalizer
                                        });
printjson(res);
