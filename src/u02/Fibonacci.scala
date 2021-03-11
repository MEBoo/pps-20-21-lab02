package u02;

object Fibonacci extends App{
  
  def fib(n: Int):Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-2) + fib(n-1)
  }

  // versione con somma in avanti di un numero fib + il precedente fib
  def fibTail(n: Int): Int = {
    @annotation.tailrec
    def _fibTail(n: Int, prev: Int, current: Int): Int = n match {
      case n if n<=0 => current
      case _ => _fibTail(n - 1, prev + current, prev)
    }
    _fibTail(n, 1, 0)
  }

  // versione derivante dalla scomposizione spettrale della versione matriciale
  def fibSuperFaster(n: Int):Int =((1/Math.sqrt(5))*(Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n))).toInt
}