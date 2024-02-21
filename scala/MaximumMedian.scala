import scala.io.StdIn.readLine

object MaximumMedian extends App {
  val Array(n, k) = readLine.split(" ").map(_.toInt)
  val arr = readLine.split(" ").map(_.toInt).sorted

  def tryX(x: Int): Boolean = {
    var operations: Long = 0
    for (i <- (n - 1) / 2 until n) {
      operations += 0 max (x - arr(i))
    }
    operations <= k
  }
  
  var l = 0
  var r = Int.MaxValue - 1

  while (l < r) {
    val mid = l + (r - l + 1) / 2
    if (tryX(mid)) l = mid
    else r = mid - 1
  }
  println(l)
}
