

object ex4 {
  
  def main(args: Array[String]) {
    
    var listOfDays = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
    println(toStringFl(listOfDays));
    println(toStringFr(listOfDays));
    println(toStringFlP(listOfDays));
  }
  
  def toStringFl(list : List[String]) : String = {
    
    if ( list.length > 0 ) {
      return list.foldLeft("")((acc, s) => acc + s + ", ");
    }
    else {
      return "";
    }
    
  }
  
  def toStringFr(list : List[String]) : String = {
    
    if ( list.length > 0 ) {
      return list.foldRight("")((s, acc) => s + ", " + acc );
    }
    else {
      return "";
    }
    
  }
  
   def toStringFlP(list : List[String]) : String = {
    
    if ( list.length > 0 ) {
      return list.foldLeft("")((acc, s) => if ( s.startsWith("P") ) {acc + s + ", "} else {acc});
    }
    else {
      return "";
    }
    
  }
  
}