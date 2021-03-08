package u02

object Composition extends App{

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def composeGeneric[A](f: A => A, g: A => A): A => A = x => f(g(x))

}