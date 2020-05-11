// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

mapper = function() {

    if (this.credit) {
        this.credit.forEach(function(obj) {
            emit(obj.currency, obj.balance);
        });
    };
};

reducer = function(key, values) {
    
    return Array.sum(values);
};

res = db.people.mapReduce(mapper, reducer, {out : {inline : 1} });
printjson(res);
