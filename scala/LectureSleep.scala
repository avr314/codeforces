import scala.io.StdIn.readLine

object LectureSleep extends App{
  val input = readLine().split(" ").map(_.toInt)
  val n = input(0)
  val k = input(1)
  
  val thms = Array(0) ++ readLine().split(" ").map(_.toInt)
  val prfx = Array(0) ++ readLine().split(" ").map(_.toInt)
  val prfxFix = new Array[Int](n+1)

  var total = 0
  for (i <- 1 until n + 1) {
    prfxFix(i) = prfxFix(i - 1) 
    if (prfx(i) == 1) {
      total += thms(i)
    } else {
      prfxFix(i) += thms(i)
    }
  }

  var runMax = 0;
  var locMin = 0;

  for (i <- 1 until n + 1) {
    locMin = n min (i + k - 1)
    runMax = runMax max (prfxFix(locMin) - prfxFix(i - 1))
  }

  println(total + runMax)

}
