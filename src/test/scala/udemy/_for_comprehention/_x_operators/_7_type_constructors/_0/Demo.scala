package udemy._for_comprehention._x_operators._7_type_constructors._0

// type constructors, infix form
object Demo extends App {
  val x0: ab[Int, String] = ???
  val x1: Int ab String = ???

  val y0: ++[Int, String] = ???
  val y1: Int ++ String = ???

  val y2: List[Int ++ String] = ???

//  class X extends (Int ++ String)

  val f: Int ++ String => String ++ Int = ???
}

// ab, ++ - type constructors
// (type constructor ab) + (type A) + (type B) => type ab[A, B] == type A ab B
// (type constructor ++) + (type A) + (type B) => type ++[A, B] == type A ++ B
case class ab[A, B](a: A, b:B)
case class ++[A, B](a:A, b:B)