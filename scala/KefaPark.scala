import scala.io.StdIn.readLine

object KefaPark extends App {
  val Array(n, m) = readLine.split(" ").map(_.toInt)
  val catArray = Array.concat(Array(0), readLine.split(" ").map(_.toInt))

  val adjArray: Array[List[Int]] = Array.fill(n + 1)(List.empty[Int])
  
  for (_ <- 0 until n-1) {
    val Array(a, b) = readLine.split(" ").map(_.toInt)
    adjArray(a) = (b) :: adjArray(a)
    adjArray(b) = (a) :: adjArray(b)
  }

  var rests = 0;

  def dfs(u: Int, cnt: Int, parent: Int): Unit = {
    val newCnt = if (catArray(u) == 1) cnt + 1 else 0

    if (newCnt > m) return

    var isLeaf = true
    adjArray(u).foreach { v =>
      if (v != parent) {
        isLeaf = false
        dfs(v, newCnt, u)
      }
    }

    if (isLeaf) rests += 1
  }

  dfs(1, 0, -1)
  println(rests)
}
