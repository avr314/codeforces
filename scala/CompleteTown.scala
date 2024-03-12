import scala.io.StdIn.readLine

object CompleteTown extends App {
  def dist(p: Array[(Int, Int)]): Double = {
    math.sqrt(math.pow(p(0)._1 - p(1)._1, 2) + math.pow(p(0)._2 - p(1)._2, 2))
  }

  def compDist(perm: Array[(Int, Int)]): Double = {
    perm.sliding(2).map(pair => dist(pair)).sum
  }

  val n = readLine().toInt
  val coords: Array[(Int, Int)] = (for (_ <- 0 until n) yield {
    val coordinate = readLine().split(" ")
    (coordinate(0).toInt, coordinate(1).toInt)
  }).toArray

  val dist = coords.permutations.map(compDist).sum
  val permCnt = coords.permutations.length.toDouble
  println(dist / permCnt)
}
