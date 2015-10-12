package udemy._4_functional_1._0_3_partially_defined._1_api

object Demo3y extends App {

  val f: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  f.runWith(println)(2)
  f.runWith(println)(4)

  val g: Int => Boolean = f.runWith(println)
  g(2)
  g(4)
}
