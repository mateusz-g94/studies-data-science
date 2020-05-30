
case class Osoba(imie: String, nazwisko: String)
{
  private var _imie = imie
  private var _nazwisko = nazwisko
  
  def pokazImie = _imie
  def pokazNazwisko = _nazwisko

}

object ex3 {
  
  def main(args: Array[String]) 
  {
   var o1 = new Osoba("Andrzej", "Grabowski")
   var o2 = new Osoba("Mateusz", "Grazda")
   var o3 = new Osoba("Piotr", "Kowalski")
   var o4 = new Osoba("Bartek", "Tykierka")
   
   przywitaj(o1)
   przywitaj(o2)
   przywitaj(o3)
   przywitaj(o4)
 
   def przywitaj(osoba : Osoba)  = osoba match
   {
     case Osoba("Andrzej", "Grabowski") => println("Witaj, Andrzej!")
     case Osoba("Mateusz", "Grazda") => println("Siema, Mateusz")
     case Osoba("Piotr", "Kowalski") => println("Czesc, Piotr!")
     case Osoba(imie, nazwisko) => println("Dzien dobry, " + imie + " " + nazwisko)
     
   }   

  }

}