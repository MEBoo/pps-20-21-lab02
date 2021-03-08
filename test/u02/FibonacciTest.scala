package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class FibonacciTest {

  import u02.Fibonacci.fib
  import u02.Fibonacci.fibTail
  
  @Test def testFibonacci(){
    assertEquals(0,fib(0))
    assertEquals(1,fib(1))
    assertEquals(1,fib(2))
    assertEquals(2,fib(3))
    assertEquals(3,fib(4))

    assertEquals(21,fib(8))
  }

  @Test def testFibonacciTail(){
    assertEquals(0,fibTail(0))
    assertEquals(1,fibTail(1))
    assertEquals(1,fibTail(2))
    assertEquals(2,fibTail(3))
    assertEquals(3,fibTail(4))

    assertEquals(21,fibTail(8))
  }

  @Test def testFibonacciSuperFaster(){
    assertEquals(0,fibTail(0))
    assertEquals(1,fibTail(1))
    assertEquals(1,fibTail(2))
    assertEquals(2,fibTail(3))
    assertEquals(3,fibTail(4))

    assertEquals(21,fibTail(8))
  }
}