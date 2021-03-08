package u02

object Optionals extends App {

  sealed trait Option[A] // An Optional data type
  object Option {
    case class None[A]() extends Option[A]
    case class Some[A](a: A) extends Option[A]

    def isEmpty[A](opt: Option[A]): Boolean = opt match {
      case None() => true
      case _ => false
    }

    def getOrElse[A, B >: A](opt: Option[A], orElse: B): B = opt match {
      case Some(a) => a
      case _ => orElse
    }

    def flatMap[A,B](opt: Option[A])(f:A => Option[B]): Option[B] = opt match {
      case Some(a) => f(a)
      case _ => None()
    }

    def filter[A](opt: Option[A])(f:A => Boolean): Option[A] = opt match {
      case Some(a) if f(a) => opt
      case _ => None()
    }

    // non ho capito bene il testo dell'esercizio - se presente trasformare in Some(true) ?
    def map[A](opt: Option[A])(f:A => Boolean): Option[Boolean] = opt match {
      case Some(a) if f(a) => Some(true)
      case _ => None()
    }

    def map2[A](opt1: Option[A],opt2: Option[A])(f:(A,A) => A): Option[A] = opt1 match {
      case None() => None();
      case Some(a) => opt2 match {
        case None() => None();
        case Some(b) => Some(f(a,b))
      }
    }
  }

  import Option._
  val s1: Option[Int] = Some(1)
  val s2: Option[Int] = Some(2)
  val s3: Option[Int] = None()

  println(s1) // Some(1)
  println(getOrElse(s1,0), getOrElse(s3,0)) // 1,0
  println(flatMap(s1)(i => Some(i+1))) // Some(2)
  println(flatMap(s1)(i => flatMap(s2)(j => Some(i+j)))) // Some(3)
  println(flatMap(s1)(i => flatMap(s3)(j => Some(i+j)))) // None
}
