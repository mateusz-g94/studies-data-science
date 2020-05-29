

object ex9 {
  
  def main(args: Array[String]) {
    
    var listNumbers = List(2, 5, 10, 20);
    var listNumbersMod = increase(listNumbers);
    println(listNumbersMod);
    
    }
  
  def increase(list : List[Int]) : List[Int] = {
    return list.map( _ + 1 );
  }
}
