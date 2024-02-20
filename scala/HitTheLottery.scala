import scala.io.StdIn.readLine

object HitTheLottery extends App{
  val billArray = Array(100, 20, 10, 5, 1)
  var n = readLine.toInt

  var totalBills = 0
  var numBills = 0

  billArray.foreach { bill => 
    numBills = n / bill 
    totalBills += numBills
    n -= numBills * bill
  }

  println(totalBills)
}
