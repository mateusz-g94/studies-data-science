// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

var res = db.people.find({"nationality" : "Germany", "sex" : "Male"}, {_id : 0}).toArray();
res.forEach(function(el) {
    printjson(el);
});


