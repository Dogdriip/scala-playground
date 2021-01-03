package ex7

object Ex_7_3 {
  def main(args: Array[String]): Unit = {
    val list1 = List("a", "b", "c")
    for (x <- list1) {
      println(x)
    }

    val list2 = "a" :: "b" :: "c" :: Nil
    for (x <- 0 until list2.size) {
      println(list2(x))
    }
  }
}
