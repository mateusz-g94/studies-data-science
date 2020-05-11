// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json
mapper = function() {

    if (this.credit) {
        this.credit.forEach(function(obj) {
            emit(obj.currency, {count : 1, balance : obj.balance});
        });
    };
};

reducer = function(key, values) {

    result = {count : 0, balance : 0};
    values.forEach(function(value){
        result.count += value.count;
        result.balance += value.balance;
    });

    return result;

};

finalizer = function(key, reduced){
    reduced.avg_balance = reduced.balance / reduced.count;
    return {avg_balance : reduced.avg_balance, sum_balance : reduced.balance};
};

query = 


res = db.people.mapReduce(mapper, reducer, {
                                            out : {inline : 1},
                                            query : {sex : "Female", nationality : "Poland"},
                                            finalize: finalizer
                                            });
printjson(res);
