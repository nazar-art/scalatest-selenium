package udemy.intro

// companion class
class Example {
  def f(x: Int): Int = x + 1
}

// companion class
object Example {
  def g(x: Int): Int = x + 1
}

object Demo {
  def main (args: Array[String]) {
    println(new Example().f(0))
    println(Example.g(0))
  }
}
