import scala.io.StdIn.readLine

object PrefixQueries extends App {
  
  def queries(): Unit = {
    val array = readLine().split(" ").map(_.toInt)
    val l = array(0)
    val r = array(1)
    println(prefixArray(r - 1) - prefixArray(l - 1))
  }

  val str: String = readLine()
  val strlen: Int = str.length
  val prefixArray = new Array[Int](strlen + 1)
  val n: Int = readLine().toInt
  var c: Int = 0

  for (i <- 1 until strlen) {
    if (str(i - 1) == str(i)) 
      c += 1
    prefixArray(i) = c
  }

  for (_ <- 0 until n) {
    queries()
  }
}
