package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test


class XYZTest {

  import XYZ._

  @Test def testNonCurriedDef(){
    
    assertTrue(nonCurriedDef(1,2,3))
    assertFalse(nonCurriedDef(1,4,3))
    assertFalse(nonCurriedDef(5,4,3))
    assertFalse(nonCurriedDef(5,1,1))
    assertFalse(nonCurriedDef(1,2,1))
  }

  @Test def testCurriedDef(){

    assertTrue(curriedDef(1)(2)(3))
    assertFalse(curriedDef(1)(4)(3))
    assertFalse(curriedDef(5)(4)(3))
    assertFalse(curriedDef(5)(1)(1))
    assertFalse(curriedDef(1)(2)(1))

    val y:Int => Int => Boolean = curriedDef(1)
    val z:Int => Boolean = y(2)

    assertTrue(z(3))
  }

  @Test def testNonCurriedVal(){

    assertTrue(nonCurriedVal(1,2,3))
    assertFalse(nonCurriedVal(1,4,3))
    assertFalse(nonCurriedVal(5,4,3))
    assertFalse(nonCurriedVal(5,1,1))
    assertFalse(nonCurriedVal(1,2,1))
  }

  @Test def testCurriedVal(){

    assertTrue (curriedVal(1)(2)(3))
    assertFalse(curriedVal(1)(4)(3))
    assertFalse(curriedVal(5)(4)(3))
    assertFalse(curriedVal(5)(1)(1))
    assertFalse(curriedVal(1)(2)(1))

    val y:Int => Int => Boolean = curriedVal(1)
    val z:Int => Boolean = y(2)

    assertTrue(z(3))
  }
}