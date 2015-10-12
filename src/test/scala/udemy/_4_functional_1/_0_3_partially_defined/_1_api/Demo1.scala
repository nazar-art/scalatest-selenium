package udemy._4_functional_1._0_3_partially_defined._1_api

object Demo1 extends App {

  val f: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  val default: PartialFunction[Int, String] = {case x => "<undefined>"}
  println("f(2) = " + (f orElse default)(2))
  println("f(4) = " + (f orElse default)(4))

  val g = (k: Int) => f orElse default
  println("f(2) = " + g(2))
  println("f(4) = " + g(4))

}
