package udemy._for_comprehention._x_operators._7_type_constructors._1

// NO precedence
object Demo extends App {
  // ((_ ++ _) **)
  val x0: Int ++ String ** Boolean = ???
  val x1: **[++[Int, String], Boolean] = ???

  // (_ ++ (_ **))
  val y0: Int ++ (String ** Boolean) = ???
  val y1: ++[Int, **[String, Boolean]] = ???
}

// type constructors
case class ++[A, B](a: A, b: B)
case class **[A, B](a: A, b: B)
