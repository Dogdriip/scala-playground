package ex8

object Ex_8_2 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.filter(_ >= 3).map(_ * 2)
    println(n)
  }
}
