import scala.io.StdIn.readLine

object Tetrahedron extends App {
  val mod = 1000000007
  val n = scala.io.StdIn.readInt()
  
  var waysToD = 1L
  var waysToNotD = 0L
  
  for (_ <- 1 until n) {
      val tempToD = waysToD
      waysToD = waysToNotD * 1 % mod
      waysToNotD = (tempToD * 3 + waysToNotD * 2) % mod
  }
  
  println(if (n > 1) waysToNotD else 0)
}
