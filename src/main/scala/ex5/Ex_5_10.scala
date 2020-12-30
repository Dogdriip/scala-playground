package ex5

object Ex_5_10 {

  class SomeClass {
    def apply(m: Int): Int = method(m)

    def method(i: Int): Int = i + i

    def method2(s: String): String = s
  }

  def main(args: Array[String]): Unit = {
    val something = new SomeClass
    println(something(2))
    println(something.apply(2))
    println(something.method(2))
  }
}
