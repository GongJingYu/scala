package document.s2

trait Iterator[A] {
  def hasNext:Boolean
  def next:A
}

class IntIterator(to: Int) extends Iterator[Int]{
  private var current:Int = 0

  override def hasNext: Boolean = current < to

  override def next: Int = {
    if(hasNext){
      var t = current
      current+=1
      t
    }else{
      0
    }
  }
}

object IntIterator{
  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(10)
    while (iterator.hasNext){
      println(iterator.next)
    }
  }
}