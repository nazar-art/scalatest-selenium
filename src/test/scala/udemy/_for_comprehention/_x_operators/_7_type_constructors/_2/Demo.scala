package udemy._for_comprehention._x_operators._7_type_constructors._2

// NO argument inverse for last ':'
object Demo extends App {
  val x0: Int ++ String = ??? // Int ++ String == ++[Int, String]
  val x1: Int :: String = ??? // Int :: String == ::[Int, String] != ::[String, Int]

  val y0: Int = x0.a
  val y1: Int = x1.a // NOT String!
}

// type constructors
case class ++[A, B](a: A, b: B)
case class ::[A, B](a: A, b: B)
