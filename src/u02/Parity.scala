package u02

object Parity extends App{
  
  def parityDef(x: Int): String = x%2 match {
    case 0 => "even"
    case 1 => "odd"
  }

  lazy val parityVal: Int => String = x => x % 2 match {
    case 0 => "even"
    case 1 => "odd"
  }

  // Soluzione del prof
  lazy val parityValProf: Int => String = {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }
}