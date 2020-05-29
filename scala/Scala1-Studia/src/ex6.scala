

object ex6 {
  
  def main(args: Array[String]) {
    
    var tupleEl = (100, "Test", 1.15)
    myPrint(tupleEl)
  
  }
  
  def myPrint(t : (Int, String, Double)) = 
  {
    println("Touple elements: " + t.toString())
  }
  
}