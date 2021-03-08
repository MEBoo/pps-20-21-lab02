package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test


class ShapesTest {

  import Shapes.Shape._

  @Test def testPerimeter(){
    assertEquals(14,perimeter(Rectangle(3,4)))
    assertEquals(18.849,perimeter(Circle(3)),0.001)
    assertEquals(12,perimeter(Square(3)))
  }

  @Test def testArea(){
    assertEquals(12,area(Rectangle(3,4)))
    assertEquals(28.274,area(Circle(3)),0.001)
    assertEquals(9,area(Square(3)))
  }
  
}