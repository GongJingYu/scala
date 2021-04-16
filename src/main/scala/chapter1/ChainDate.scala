package chapter1

import java.util.{Date, Locale}
import java.text.DateFormat._

object ChainDate {
  def main(args: Array[String]): Unit = {
    val date = new Date
    val df = getDateInstance(LONG,Locale.CHINA)
    println(df format date)
    println(df.format(date))
  }
}
