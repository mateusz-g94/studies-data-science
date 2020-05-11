// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

// Konwersja do Date
db.people.find(
    {birth_date : {$exists : true}}).forEach(function(obj){
        obj.birth_date = new Date(obj.birth_date);
        db.people.save(obj);
    });

// Zapytanie
var res = db.people.find(
    {birth_date : {$gte : new Date("2000-01-01")}},
    {_id : 0, first_name : 1, last_name : 1, "location.city" : 1}).toArray();

res.forEach(function(el) {
    printjson(el);
});
