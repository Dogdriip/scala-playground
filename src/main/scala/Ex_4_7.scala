object Ex_4_7 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig
    pig.eat
    pig.shout
    pig.fly
  }
}

class Pig extends Animal3 with Flying with Eating {
  def shout = println("PigShout")
  def eat = println("Eat.")
}

abstract class Animal3 {
  def shout
}
