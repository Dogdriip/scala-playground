package ex8

object Ex_8_4 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.partition(_ < 3)
    println(n)
  }
}