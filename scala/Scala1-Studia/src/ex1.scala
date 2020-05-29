

object ex1 {
  
  def main(args: Array[String]) {
    
    var listOfDays = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
    println(toStringFor(listOfDays));
    println(toStringPFor(listOfDays));
    println(toStringWhile(listOfDays));
  
  }
  
  def toStringFor(list : List[String]) : String = {
    var result: String = ""; 
    for(arg <- list) {
      if (!result.isEmpty) { 
        result = result + ", " + arg;
      }
      else {
        result = arg;
      }
    }
    return result;
  }
  
  def toStringPFor(list : List[String]) : String = {
    var result: String = "";
    for (arg <- list if arg.startsWith("P")){
      if (!result.isEmpty) { 
        result = result + ", " + arg;
      }
      else {
        result = arg;
      }
    }
    return result;
  }
  
  def toStringWhile(list : List[String]) : String = {
    var result: String = "";
    var i: Int = 0;
    while( i < list.length) {
      
      if (!result.isEmpty) { 
        result = result + ", " + list(i);
      }
      else {
        result = list(i);
      }
      i+=1;
    }
    
    return result;
  }
  
}

