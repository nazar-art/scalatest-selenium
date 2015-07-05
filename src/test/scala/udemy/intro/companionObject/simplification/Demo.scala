package udemy.intro.companionObject.simplification

class Demo {
  // scala method in Java style
  def f0(x: Int, y: Int): Int = {
    return x * x + y * y;
  }

  // semicolon inference
  def f1(x: Int, y: Int): Int = {
    return x * x + y * y
  }

  // last expression return
  def f2(x: Int, y: Int): Int = {
    x * x + y * y
  }

  // single expression
  def f3(x: Int, y: Int): Int = x * x + y * y

  // return type inference
  def f4(x: Int, y: Int) = x * x + y * y

  // params == val
  def f5(x: Int, y: Int) = {
//    x = x * x
//    y = y * y
    x + y
  }

  def f6(x: Int, y: Int): Int = {
    val sqrtX = x * x
    val sqrtY = y * y
    sqrtX + sqrtY
  }

  // nested function!
  def f7(x: Int, y: Int): Int = {
    def sqr(t: Int) = x * x
    sqr(x) + sqr(y)
  }

  // recursive def definition and return type inference
//  def f(x: Int)       = if (x == 0) 1 else x * f(x - 1)
  def f(x: Int): Int  = if (x == 0) 1 else x * f(x - 1)
}

object Demo extends App {
  println(new Demo().f(4))
}
