import scala.io.StdIn.readLine

object Fence extends App {
  val input = readLine().split(" ").map(_.toInt)
  val n = input(0)
  val k = input(1)

  val prefixArray = readLine().split(" ").map(_.toInt)
  val prefixSum = new Array[Int](n + 1)
  prefixSum(0) = 0

  for (i <- 0 until n) {
    prefixSum(i + 1) += prefixSum(i) + prefixArray(i)
  }

  var runMin = prefixArray.sum
  var preDiff = 0
  var idx = -1

  for (j <- k until n + 1) {
    preDiff = prefixSum(j) - prefixSum(j - k) 
    println(s"preDiff for j=$j: $preDiff")
    println(s"index: $idx")
    if (preDiff <= runMin) {
      runMin = preDiff
      idx = j - k
    }
  }
  println(idx + 1)
}
