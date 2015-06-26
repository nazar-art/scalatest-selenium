package udemy.intro

object StringVsInt {
  def main(args: Array[String]) {
    val x: Int = 0
    val from0to5: Range = x.to(5)
    println(from0to5)

    val s: String = "abc"
    val c: Char = s.last
    val capitalized: String = s.capitalize
    println(capitalized)
  }
}