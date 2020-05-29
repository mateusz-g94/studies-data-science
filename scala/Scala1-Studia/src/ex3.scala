import scala.annotation.tailrec

object ex3 {
  
  def main(args: Array[String]) {
    
    var listOfDays = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
    println(toStringRec(listOfDays));
  }
  
  
  def toStringRec(list : List[String]) : String = 
  {
    @tailrec
    def stringAcc(acc: String, list : List[String]) : String =
    {
      if ( list.length == 0 ) 
      {
        acc
      }
      else
      {
        stringAcc(if ( list.length > 1 ) {acc + list.head + ", " } else {acc + list.head + "." }, list.slice(1, list.length))
      }
    }
    
    stringAcc("", list)
    
  }
  
}