import scala.io.StdIn.readLine

object CutRibbon extends App { 
  val Array(n, a, b, c) = readLine().split(" ").map(_.toInt)
  val dp = Array.fill(n + 1)(-1)
  dp(0) = 0

  Seq(a, b, c).foreach { x =>
    (0 to n).foreach { i =>
      if (i >= x && dp(i - x) != -1) {
        dp(i) = dp(i) max dp(i - x) + 1
      }
    }
  }
  println(dp(n))
}
