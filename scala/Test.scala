import scala.io.StdIn.readLine

object Test extends App {
  val arr: Array[Int] = Array.fill(3)(1)
  arr(0) = 2

  println(arr.mkString(" "))
}
