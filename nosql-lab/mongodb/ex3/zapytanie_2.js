// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

var res = db.people.findOne({"nationality" : "China", "sex" : "Female"}, {_id : 0});
printjson(res);