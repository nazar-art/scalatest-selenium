package udemy._for_comprehention._x_operators._7_type_constructors._3

// NO argument inverse for last ':'
// YES right associativity for last ':'
object Demo extends App {
  val x0: Int ++ String ++ Boolean = ???
  val x1: ++[++[Int, String], Boolean] = ???

  val a0: ++[Int, String] = x0.a
  val a1: Boolean = x0.b


  val y0: Int :: String :: Boolean = ???
  val y1: ::[Int, ::[String, Boolean]] = ???

  val b0: Int = y0.a
  val b1: ::[String, Boolean] = y0.b
}

// type constructors
case class ++[A, B](a: A, b: B)
case class ::[A, B](a: A, b: B)
