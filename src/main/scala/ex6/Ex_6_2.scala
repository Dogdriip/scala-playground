package ex6

object Ex_6_2 {
  case class Person(name: String, age: Int, rank: String)

  def main(args: Array[String]): Unit = {
    val person1 = Person("이멋남", 47, "부회장")
    val person2 = Person("김쾌남", 73, "회장")
    val person3 = Person("김솔로", 27, "사원")
    val person4 = Person("홍길동", 20, "무직")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
    matchAndHi(person4)
  }

  def matchAndHi(person: Person): Unit = person match {
    case Person("이멋남", 47, "부회장") => println("부회장 하위!")
    case Person("김쾌남", 73, "회장") => println("회장 하위!")
    case Person("김솔로", 27, x) => println(x + " 하위!")
    case _ => println("매치되는 결과가 없습니다.")
  }
}
