package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test


class FibonacciTest {

  import u02.Fibonacci.fib
  
  @Test def testFibonacci(){
    assertEquals(0,fib(0))
    assertEquals(1,fib(1))
    assertEquals(1,fib(2))
    assertEquals(2,fib(3))
    assertEquals(3,fib(4))
  }
  
}