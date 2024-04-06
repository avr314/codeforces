import scala.io.StdIn.readLine

object EasyProblem extends App {
  val n = readLine().toInt
  val s = readLine()
  val ambArr = ("0 " + readLine()).split(" ").map(_.toLong)

  val dp = Array.fill(5)(0L)

  for (i <- 1 to n) {
    val a = ambArr(i)
    s(i - 1) match {
      case 'h' => dp(1) += a
      case 'a' => dp(2) = math.min(dp(2) + a, dp(1))
      case 'r' => dp(3) = math.min(dp(3) + a, dp(2))
      case 'd' => dp(4) = math.min(dp(4) + a, dp(3))
      case _ =>
    }
  }
  println(dp(4))
}
