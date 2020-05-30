
class Osoba2(imie: String, nazwisko: String, podatek: Int)
{
  private var _imie = imie
  private var _nazwisko = nazwisko
  private var _podatek = podatek
}

trait Pracownik extends Osoba2
{
  private var _pensja = 1000
  override var _podatek = 0.2 * _pensja
  
  def pokazPensja = _pensja
  def ustaw_pensja(pensja: Int)
  {
    _pensja = pensja
    _podatek = 0.2 * _pensja
  }
   
}

trait Student extends Osoba2
{
  override var _podatek = 0
}

trait Nauczyciel extends Pracownik
{
  override var _podatek = 0.1 * this.pokazPensja
  override def ustaw_pensja(pensja: Int)
  {
    var _pensja = pensja
    _podatek = 0.1 * pensja
  }
}



object ex5 
{
  def main(args: Array[String])
  {
    var test = new Osoba2("Jan", "Brzechwa", 0) with Pracownik
    var test2 = new Osoba2("Jan", "Brzechwa", 10) with Student
    println(test.pokazPensja)
  }
}