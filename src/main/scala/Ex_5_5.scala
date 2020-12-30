object Ex_5_5 {
  def main(args: Array[String]): Unit = {
    val thisYear = 2020

    val fixedValueFunction = go(thisYear, _: String)
    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")
  }

  def go(thisYear: Int, string: String): Unit = {
    println(string + ": " + thisYear)
  }
}
