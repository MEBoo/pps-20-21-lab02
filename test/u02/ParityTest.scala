package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ParityTest {

  import Parity._

  @Test def testParityDef(){
    assertEquals("even",parityDef(2))
    assertEquals("odd",parityDef(1))
  }
  @Test def testParityVal(){
    assertEquals("even",parityVal(2))
    assertEquals("odd",parityVal(1))
  }
  @Test def testParityValProf(){
    assertEquals("even",parityValProf(2))
    assertEquals("odd",parityValProf(1))
  }
}