
class KontoBankowe(poczatkowyStan: Int)
{
     
    def this() 
    {                             /* dodatkowy konstrkutor */
      this(0)
    }
 
    private var stanKonta = poczatkowyStan;   /* pole prywatne */
    def pokazStanKonta = stanKonta;           /* getter */
    
    def wplata(wartosc: Int)
    {
      stanKonta += wartosc
      println("Wplacono: " + wartosc)
    }
    
    def wyplata(wartosc: Int)
    {
      stanKonta -= wartosc
      println("Wyplacono: " + wartosc)
    }
    
}

object ex2
{
  
  def main(args: Array[String]) 
  {
    var test = new KontoBankowe();
    println("Stan konta: " + test.pokazStanKonta)
    test.wplata(50)
    println("Stan konta: " + test.pokazStanKonta)
    test.wplata(25)
    println("Stan konta: " + test.pokazStanKonta)
    test.wyplata(10)
    println("Stan konta: " + test.pokazStanKonta)  
  }
  
}