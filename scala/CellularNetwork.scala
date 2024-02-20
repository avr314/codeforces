import scala.io.StdIn.readLine

object CellularNetwork extends App {
  def dist(a: Int, b: Int): Int = {
    if (a > b) a - b else b - a
  }


  val nm = readLine().split(" ").map(_.toInt)
  val n = nm(0)
  val m = nm(1)
  val aArr = readLine().split(" ").map(_.toInt)
  val bArr = readLine().split(" ").map(_.toInt)

  var ans = 0
  var j = 0

  for (i <- 0 until n) {
    while ((j + 1) < m && dist(aArr(i), bArr(j)) >= dist(aArr(i), bArr(j + 1))) {
      j += 1
    }
    ans = ans max dist(aArr(i), bArr(j))
  } 
  println(ans)
}
