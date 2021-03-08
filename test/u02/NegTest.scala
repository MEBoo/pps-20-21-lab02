package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.Neg.{negDef, negGeneric, negVal}

class NegTest {

  val empty: String => Boolean = _==""
  var notEmptyDef: String => Boolean = negDef(empty);
  var notEmptyVal: String => Boolean = negVal(empty);

  @Test def testNegDef(){
    assertTrue(notEmptyDef("foo"))
    assertFalse(notEmptyDef(""))

    assertTrue(notSize5Def("foo"))
    assertFalse(notSize5Def("fooooo"))
  }

  val size5: String => Boolean = _.length>=5
  var notSize5Def: String => Boolean = negDef(size5);
  var notSize5Val: String => Boolean = negVal(size5);

  @Test def testNegVal(){
    assertTrue(notEmptyVal("foo"))
    assertFalse(notEmptyVal(""))

    assertTrue(notSize5Val("foo"))
    assertFalse(notSize5Val("fooooo"))
  }

  val zero: Int => Boolean = _==0
  var notZero: Int => Boolean = negGeneric[Int](zero);

  @Test def testNegGeneric(){
    assertFalse(notZero(0))
    assertTrue(notZero(5))
  }
}