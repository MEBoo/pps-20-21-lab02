package u02

object Shapes extends App {

  sealed trait Shape
  object Shape {

    case class Rectangle(w:Double,h:Double) extends Shape
    case class Circle(r:Double) extends Shape
    case class Square(l:Double) extends Shape

    def perimeter(shape: Shape):Double = shape match {
      case Rectangle(w,h) => w*2+h*2
      case Circle(r) => r*2*Math.PI
      case Square(l) => l*4
    }

    def area(shape: Shape):Double = shape match {
      case Rectangle(w,h) => w*h
      case Circle(r) => r*r*Math.PI
      case Square(l) => l*l
    }
  }

}
