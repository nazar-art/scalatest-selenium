package udemy._5_generics_1

object Quiz extends App {
  def L[A](xs: A*) = xs.toList

  println(L(L(1, 2), L(3)).map(_.mkString("#")).mkString(":"))
  println(L(L(1), L(2), L(3)).map(_.mkString("#")).mkString(":"))
  println(L(L(1), L(2, 3)).map(_.mkString("#")).mkString(":"))
  println(L(L(1, 2, 3)).map(_.mkString("#")).mkString(":"))

  println
  println(List(1, 2, 3, 4).fold(1)(_ + _))
  println(List(1, 2, 3, 4).fold(0)(_ * _))
  println(List(1, 2, 3, 4).fold(1)(_ * _))

  // LAZY
}
