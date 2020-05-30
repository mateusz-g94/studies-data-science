

object ex4 
{
  def main(args: Array[String]) 
  {
    println("Kwadrat: " + kwadrat(2))
    println("Fabryka: " + fabryka(2, kwadrat)) 
  }
  
  def kwadrat(wartosc: Int) : Int =
  {
    wartosc * wartosc
  }
  
  def fabryka(wartosc: Int, f: Int => Int) : Int =
  {
    var i = 0;
    var wartosc_tmp = wartosc;
    
    for( i <- 1 to 3) 
    {  
      wartosc_tmp = f(wartosc_tmp) 
    }
    wartosc_tmp
  }
  
}