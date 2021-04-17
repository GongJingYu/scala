package document.s2

class Boom {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x: Int = _x
  def x_= (newValue:Int):Unit ={
    if (newValue < bound){
      _x = newValue
    }else{
      printWarning()
    }
  }

  def y: Int = _y
  def y_= (newValue:Int):Unit ={
    if (newValue < bound) _y = newValue else printWarning()
  }

  private def printWarning(): Unit = println("WARNING: Out of bounds")

  def log(message:String,level:String="info"):Unit=println(s"$message,$level")
}

object Boom{
  def main(args:Array[String]):Unit={
    var boom = new Boom

    boom.log("String")
    boom.log("String","WARNING")
  }
}