// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

// Konwersja do float
db.people.find(
    {weight : {$exists : true}}).forEach(function(obj){
        obj.weight = parseFloat(obj.weight);
        db.people.save(obj);
    });

// Zapytanie
var res = db.people.find(
    {$and : [{weight : {$gte : 68}}, {weight : {$lt : 71.5}}]},
    {_id : 0}).toArray();

res.forEach(function(el) {
    printjson(el);
});
