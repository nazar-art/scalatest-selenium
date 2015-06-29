package udemy.intro.objectExplanation

import udemy.intro.objectExplanation.IntLib.max

// utility function / constant
object Demo {
  def main(args: Array[String]) {
    println(max(7, 3))
  }
}

object IntLib {
  val MAX_INT = java.lang.Integer.MAX_VALUE

  def max(x: Int, y: Int) = if (x > y) x else y
}
