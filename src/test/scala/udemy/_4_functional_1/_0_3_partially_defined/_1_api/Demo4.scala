package udemy._4_functional_1._0_3_partially_defined._1_api

object Demo4 extends App {

  val f0: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  // Bad!
  val g0: Int => String = f0                    // Int => String | Exception

  // Good!
  val g1: Int => Option[String] = f0.lift       // Int => Option[String]

  // f0 == f1
  val g2: PartialFunction[Int, String] = Function.unlift(g1)

}
