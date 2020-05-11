// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

// Konwersja do float
db.people.find(
    {height : {$exists : true}}).forEach(function(obj){
        obj.height = parseFloat(obj.height);
        db.people.save(obj);
    });

// Zapytanie
var res = db.people.remove(
    {height : {$gt : 190}}
);

printjson(res);