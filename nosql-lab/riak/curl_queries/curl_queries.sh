#!bin/bash

echo 'Start';

echo 'Ex1';
curl -v  -X PUT http://192.168.55.10:8098/riak/s20368/film1 -H "Content-Type: application/json" -d '{"tytul" : "Wladca Pierscieni", "liczba_czesci" : 3, "rezyser" : "Peter Jackson", "rok" : 2001}' > output_ex1;

echo 'Ex1';
curl -v  -X PUT http://192.168.55.10:8098/riak/s20368/film2 -H "Content-Type: application/json" -d '{"tytul" : "Twister", "liczba_czesci" : 1, "rezyser" : "Jan De Bont", "rok" : 1996}' >> output_ex1;

echo 'Ex1';
curl -v  -X PUT http://192.168.55.10:8098/riak/s20368/film3 -H "Content-Type: application/json" -d '{"tytul" : "Kac Vegas", "liczba_czesci" : 3, "rezyser" : "Todd Philips", "rok" : 2009}' >> output_ex1;

echo 'Ex1';
curl -v  -X PUT http://192.168.55.10:8098/riak/s20368/film4 -H "Content-Type: application/json" -d '{"tytul" : "Gwiezdne Wojny", "liczba_czesci" : 9, "rezyser" : "George Lucas", "rok" : 1977}' >> output_ex1;

echo 'Ex1';
curl -v  -X PUT http://192.168.55.10:8098/riak/s20368/film5 -H "Content-Type: application/json" -d '{"tytul" : "Avengersi", "liczba_czesci" : 3, "rezyser" : "Joss Whedon", "rok" : 2012}' >> output_ex1;

echo 'Ex2';
curl -v http://192.168.55.10:8098/riak/s20368/film2 > output_ex2;

echo 'Ex3';
curl -v -X PUT http://192.168.55.10:8098/riak/s20368/film5 -H "Content-Type: application/json" -d '{"tytul" : "Avengersi", "liczba_czesci" : 3, "rezyser" : "joss Whedon", "rok" : 2012, "gatunek" : "fantsy"}' > output_ex3;

echo 'Ex4';
curl -v -X PUT http://192.168.55.10:8098/riak/s20368/film4 -H "Content-Type: application/json" -d '{"tytul" : "Gwiezdne Wojny", "liczba_czesci" : 9, "rezyser" : "George Lucas"}' > output_ex4;

echo 'Ex5';
curl -v  -X PUT http://192.168.55.10:8098/riak/s20368/film3 -H "Content-Type: application/json" -d '{"tytul" : "Kac Vegas", "liczba_czesci" : 4, "rezyser" : "Todd Philips", "rok" : 2009}' > output_ex5;

echo 'Ex6';
curl -v -XDELETE http://192.168.55.10:8098/riak/s20368/film1 > output_ex6;

echo 'Ex7';
curl -v http://192.168.55.10:8098/riak/s20368/film1 > output_ex7;

echo 'Ex8';
curl -v  -X PUT http://192.168.55.10:8098/riak/s20368/film6 -H "Content-Type: application/json" -d '{"test"}' > output_ex8;

echo 'Ex9';
curl -v http://192.168.55.10:8098/riak/s20368/film6 > output_ex9;

echo 'Ex10';
curl -v -XDELETE http://192.168.55.10:8098/riak/s20368/film6 > output_ex10;
