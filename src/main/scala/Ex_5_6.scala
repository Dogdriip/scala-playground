object Ex_5_6 {
  def main(args: Array[String]): Unit = {
    val g = f _
    val g2: (Int => Int) = f

    println(f(1))
  }

  def f(i: Int): Int = i
}
