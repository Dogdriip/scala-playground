package ex8

object Ex_8_5 {
  def main(args: Array[String]): Unit = {
    val l1 = List(1, 2, 3, 4)
    val l2 = List(5, 6, 7, 8, 9)

    val n1 = l1 zip l2
    val n2 = l1 ::: l2

    println(n1)
    println(n2)
  }
}
