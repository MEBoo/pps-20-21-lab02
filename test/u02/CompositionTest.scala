package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class CompositionTest {

  import Composition._

  @Test def testComposition(){
    assertEquals(9,compose(_-1,_*2)(5))
  }

  @Test def testCompositionGeneric(){
    assertEquals(12.1,composeGeneric[Double](_+1.1,_*2.2)(5))
  }
}