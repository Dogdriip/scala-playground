package ex4

object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new Animal
    flyingWhale.swim
    flyingWhale.fly
  }
}

class Animal extends Flying with Swimming

trait Swimming {
  def swim: Unit = println("Swim.")
}

trait Flying {
  def fly: Unit = println("Fly.")
}

trait Running {
  def run: Unit = println("Run.")
}

trait Eating {
  def eat
}


