package ex8

object Ex_8_6 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)

    // val n = o.find(i => i >= 2)
    // val nn = o.find(i => i == 9)
    val n = o.find(_ >= 2)
    val nn = o.find(_ == 9)

    println(n)
    println(nn)
  }
}
