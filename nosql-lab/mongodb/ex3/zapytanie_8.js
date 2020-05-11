// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

var res = db.people.updateMany(
    {"location.city" : "Moscow"},
    {$set : {"location.city" : "Moskwa"}}
);

printjson(res);