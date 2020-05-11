// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

var res = db.people.aggregate([
    {$match : {sex : "Female", nationality : "Poland"}},
    {$unwind : "$credit"},
    {$group :{
        _id : "$credit.currency",
        sum_balance : {$sum : "$credit.balance"},
        avg_balance : {$avg : "$credit.balance"}
    }},
    {$project:{
            _id : 1,
            "sum_balance" : 1,
            "avg_balance" : 1

    }}
]);

res.forEach(function(el) {
    printjson(el);
});