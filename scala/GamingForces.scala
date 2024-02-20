import scala.io.StdIn.readLine

object GamingForces extends App {
  def ceilDiv(n: Int, d: Int): Int = {
    (n + d - 1) / d
  }

  val t: Int = readLine().toInt

  for (_ <- 0 until t) {
    // User input
    val n: Int = readLine().toInt
    val hArr: Array[Int] = readLine().split(" ").map(_.toInt)

    // Greedy
    val wimps: Int = hArr.count(_ == 1)
    println(ceilDiv(wimps, 2) + n - wimps)
  }
}
