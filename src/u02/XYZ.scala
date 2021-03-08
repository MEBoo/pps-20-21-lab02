package u02

object XYZ extends App{
  
  def nonCurriedDef(x: Int, y: Int, z: Int): Boolean = x <= y && y <= z
  def curriedDef(x: Int)(y: Int)(z: Int): Boolean = x <= y && y <= z

  lazy val nonCurriedVal:(Int, Int, Int) => Boolean = (x,y,z) => (x <= y && y <= z)
  lazy val curriedVal:Int => Int => Int => Boolean = x => y => z => (x <= y && y <= z)

}