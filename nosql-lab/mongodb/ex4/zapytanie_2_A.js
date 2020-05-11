// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

// Konwersja credit.balance do float
db.people.find(
    {credit : {$exists : true}}).forEach(function(obj){
        
        obj.credit.forEach(function(obj2){
            obj2.balance = parseFloat(obj2.balance);
            db.people.save(obj);
            });
        
    });
    
var res = db.people.aggregate([
    {$unwind : "$credit"},
    {$group :{
        _id : "$credit.currency",
        sum_balance : {$sum : "$credit.balance"}
    }}
]);

res.forEach(function(el) {
    printjson(el);
});