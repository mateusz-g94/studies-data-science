import scala.annotation.tailrec

object ex8 {
  
  def main(args: Array[String]) {
    
    var listNumbers = List(-5, -2, -1, 0, 1, 2, 0, 5);
    println(dropZero(listNumbers));
  }
  
  def dropZero(list : List[Int]) : List[Int] =
  {
    @tailrec
    def dropZeroAcc(list : List[Int], acc : List[Int]) : List[Int] = 
    {
      if ( list.length == 0 ){
        acc
      }
      else 
      {
        dropZeroAcc(list.slice(1, list.length), if (list.head != 0) {acc :+ list.head} else {acc})
      }
    }
    dropZeroAcc(list, List())
  }
}