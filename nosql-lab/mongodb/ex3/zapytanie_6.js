// mongo nbd zapytanie_1.js --authenticationDatabase admin -u thatone -p ### | tail -n +4  > wynik_1.json

var obj = {
	"sex" : "Male",
	"first_name" : "Mateusz",
	"last_name" : "Grazda",
	"job" : "Big data analyst",
	"email" : "mateusz.grazda@gmail.com",
	"location" : {
		"city" : "Warszawa",
		"address" : {
			"streetname" : "Wegierska",
			"streetnumber" : "1"
		}
	},
	"description" : "et commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum",
	"height" : "174",
	"weight" : 61,
	"birth_date" : new Date("1994-09-22"),
	"nationality" : "Poland",
	"credit" : [
		{
			"type" : "visa",
			"number" : "230406750601581865",
			"currency" : "PLN",
			"balance" : "10000000"
		},
		{
			"type" : "maestro",
			"number" : "3104793147048",
			"currency" : "RUB",
			"balance" : "250000000"
		}
		
	]
};

var res = db.people.insert(obj);

printjson(res);
