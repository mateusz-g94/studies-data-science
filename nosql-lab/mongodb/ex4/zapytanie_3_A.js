// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

var res = db.people.aggregate([
    {$group:
        {_id : "$job"}

    }
]);

res.forEach(function(el) {
    printjson(el);
});