

object ex7 {
  
  def main(args: Array[String]) {
    
    var listOfProducts= Map("produkt1" -> "green", "produkt2" -> "blue", "produkt3" -> "black");
    println("Color of product: " + printWithOption(listOfProducts.get("produkt1")));
    println("Color of product: " + printWithOption(listOfProducts.get("produkt11")));
    
    
    }
    
    def printWithOption(value : Option[String]) = value match {
      case Some(x) => x
      case None => "product doesnt exist"
    }
  
}