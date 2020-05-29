

object ex10 {
  
  def main(args: Array[String]) {
    
    var listNumbers = List(-25.2, -6.0, -5.0, 1.2, -0.5, -0.5, 0.5, 2.8, 5.0, 20.1, 100.7);
    println(myFilter(listNumbers));
    println(myFilterNoDuplicates(listNumbers));
   
    
    }
  
  def myFilter(list : List[Double]) : List[Double] = {
    list.filter( x => ( x >= -5.0 ) && ( x <= 12.0) ).map(_.abs)
  }
  
  def myFilterNoDuplicates(list : List[Double]) : List[Double] = {
    list.filter( x => ( x >= -5.0 ) && ( x <= 12.0) ).map(_.abs).distinct
  }
  
}