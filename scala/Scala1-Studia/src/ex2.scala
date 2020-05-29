

object ex2 {
  
  def main(args: Array[String]) {
    
    var listOfDays = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
    println(toStringRec(listOfDays));
    println(toStringRecRev(listOfDays));
  }
  
  def toStringRec(list : List[String]) : String = {
    
   if ( list.length > 1 ) {
     return list.head + ", " + toStringRec(list.slice(1, list.length));
   }
   else if (list.length == 1) {
     return list.head;
   }
   else {
     return "";
   }
  };
  
  def toStringRecRev(list : List[String]) : String = {
    
   if ( list.length > 1 ) {
     return list.last + ", " + toStringRecRev(list.slice(0, list.length-1));
   }
   else if (list.length == 1) {
     return list.last;
   }
   else {
     return "";
   }
  }
  
}