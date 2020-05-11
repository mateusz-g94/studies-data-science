// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

// Konwersja do float
db.people.find(
    {height : {$exists : true}}).forEach(function(obj){
        obj.height = parseFloat(obj.height);
        db.people.save(obj);
    });

db.people.find(
    {weight : {$exists : true}}).forEach(function(obj){
        obj.weight = parseFloat(obj.weight);
        db.people.save(obj);
    });

var res = db.people.aggregate(
    [{$group : {
        _id : "$sex",
        avg_weight : {$avg : "$weight"},
        avg_height : {$avg : "$height"}
    }}]
);

res.forEach(function(el) {
    printjson(el);
});