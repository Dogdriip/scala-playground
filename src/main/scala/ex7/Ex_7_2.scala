package ex7

import scala.Array.ofDim

object Ex_7_2 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(13, "hi", 1.42)
    for (x <- arrayA) {
      println(x)
    }

    val matrix = ofDim[Int](4, 5)
    matrix(2)(3) = 3
    println(matrix(2)(3))
  }
}
