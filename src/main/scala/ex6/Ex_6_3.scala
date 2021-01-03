package ex6

object Ex_6_3 {
  def main(args: Array[String]): Unit = {
    val number1 = "010-222-2222"
    val number2 = "119"
    val number3 = "가나다"
    val numberList = List(number1, number2, number3)

    for (number <- numberList) {
      number match {
        case Emergency() => println("긴급전화입니다.")
        case Normal(number) => println("일반전화입니다. - " + number)
        case _ => println("판단할 수 없습니다.")
      }
    }
  }

  object Emergency {
    def unapply(number: String): Boolean = number.length == 3 && number.forall(_.isDigit)
  }

  object Normal {
    def unapply(number: String): Option[Int] = {
      try {
        val o = number.replaceAll("-", "")
        Some(o.toInt)
      } catch {
        case _: Throwable => None
      }
    }
  }
}
