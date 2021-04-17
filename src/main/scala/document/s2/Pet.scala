package document.s2

import scala.collection.mutable.ArrayBuffer

trait Pet {
  val name:String
}

class Dog(val name:String) extends Pet

class Cat(val name:String) extends Pet

object Test{
  def main(args: Array[String]): Unit = {
    var animals = ArrayBuffer.empty[Pet]
    animals.addOne(new Dog("Dog"))
    animals.addOne(new Cat("Cat"))

    animals.foreach(e => println(e))
  }
}