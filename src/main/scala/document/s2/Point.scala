package document.s2

class Point(var x: Int=0,var y: Int=0) {

  def move(dx: Int, dy: Int):Unit={
    x = x+dx
    y = y+dy
  }

  override def toString: String = {
    s"($x,$y)"
  }
}

object Point{
  def main(args: Array[String]):Unit={
    val point = new Point(1,2)
    val point1 = new Point()
    point1.move(1,1)
    println(point1)
  }
}