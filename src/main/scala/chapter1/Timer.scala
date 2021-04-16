package chapter1

object Timer {

  def oncePreSecond(callable:() => Unit): Unit={
    while (true){
      callable()
      Thread sleep 1000
    }
  }

  def timeFiles(): Unit={
    println("time files like an arrow")
  }

  def main(args: Array[String]): Unit = {
    oncePreSecond(timeFiles)
  }
}
