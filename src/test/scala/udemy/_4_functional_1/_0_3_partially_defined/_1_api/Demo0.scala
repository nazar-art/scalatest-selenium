package udemy._4_functional_1._0_3_partially_defined._1_api

object Demo0 extends App {

  val f: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  println("f(2) = " + (f applyOrElse (2, (x: Int) => "<undefined>")))
  println("f(4) = " + (f applyOrElse (4, (x: Int) => "<undefined>")))

  val default = (x: Int) => "<undefined>"
  println("f(2) = " + (f applyOrElse (2, default)))
  println("f(4) = " + (f applyOrElse (4, default)))

  val g = (k: Int) => f applyOrElse (k, default)
  println("f(2) = " + g(2))
  println("f(4) = " + g(4))

}
