

object ex5 {
  
  def main(args: Array[String]) {
    
    var listOfProducts= Map("produkt1" -> 100.0, "produkt2" -> 150.0, "produkt3" -> 125.5);
    var listOfProductsMod = listOfProducts.mapValues( _ * 0.9 );
    println(listOfProductsMod);
    
    }
}