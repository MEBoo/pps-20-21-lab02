package u02

object Neg extends App{
  
  def negDef(predicate: String => Boolean):String => Boolean = !predicate(_)

  lazy val negVal:(String => Boolean) => (String => Boolean) = predicate => !predicate(_)

  def negGeneric[A](predicate: A => Boolean):A => Boolean = !predicate(_)

}