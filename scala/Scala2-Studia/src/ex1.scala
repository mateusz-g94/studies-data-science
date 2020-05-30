

object ex1 {
  
  def main(args: Array[String]) {
    
    println(sprawdz_dzien("Wtorek"));
    println(sprawdz_dzien("SRODA"));
    println(sprawdz_dzien("sobota"));
    println(sprawdz_dzien("TAK"));
    
  }
    
    def sprawdz_dzien(tekst: String) : String = tekst.toUpperCase() match {
      case "PONIEDZIALEK" => "Praca"
      case "WTOREK" => "Praca"
      case "SRODA" => "Praca"
      case "CZWARTEK" => "Praca"
      case "PIATEK" => "Praca"
      case "SOBOTA" => "Wolne"
      case "NIEDZIELA" => "Wolne"
      case _ => "Nie ma takiego dnia"
      
      
      
    }  
}