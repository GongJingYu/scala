package document.s1

class Greeter(prefix: String, suffix: String) {
  def greet(name: String):Unit={
    println(prefix + name + suffix)
  }
}

case class Point(x: Int, y: Int)

object Greeter{

  def main(args: Array[String]): Unit = {
    val greeter = new Greeter("Hello ","I am gjy");
    greeter.greet("jim")

    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    if (point == anotherPoint) {
      println(point + " and " + anotherPoint + " are the same.")
    } else {
      println(point + " and " + anotherPoint + " are different.")
    }
    if (point == yetAnotherPoint) {
      println(point + " and " + yetAnotherPoint + " are the same.")
    } else {
      println(point + " and " + yetAnotherPoint + " are different.")
    }

    List("a string",4342,'c',true,()=>"hello").foreach(e=>println(e))
  }
}