package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class OptionsTest {

  import Optionals.Option._

  @Test def testFilter(){
    assertEquals(Some(5),filter(Some(5))(_ > 2))
    assertEquals(None(),filter(Some(5))(_ > 8))
  }

  @Test def testMap(){
    assertEquals(Some(2),map(Some(1))(_ + 1))
    assertEquals(None(),map(None[Int])(_ + 1))

    assertEquals(Some(true),map(Some(5))(_ > 2))
    assertEquals(None(),map(None[Int])(_ > 2))
  }

  @Test def testMap2(){
    assertEquals(Some(15),map2(Some(5),Some(10))(_+_))
    assertEquals(None(),map2(Some(5),None())(_+_))
    assertEquals(None(),map2(None(),Some(5))(_+_))
  }
  
}