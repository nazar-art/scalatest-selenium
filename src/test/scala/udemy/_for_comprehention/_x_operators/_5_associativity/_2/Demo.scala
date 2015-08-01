package udemy._for_comprehention._x_operators._5_associativity._2

object Demo extends App {
  // diff precedence, same assoc (left)
  println(I(1) ++ I(2) ** I(3) ++ I(4))
  // diff precedence, same assoc (right)
  println(I(1) +: I(2) *: I(3) +: I(4))
  // diff precedence, diff assoc (left + right)
  println(I(1) ++ I(2) *: I(3) ++ I(4))

  // compiler error
  // same precedence, diff assoc (left + right)
//  println(I(1) ++ I(2) +: I(3) ++ I(4))
//  println(I(1) ** I(2) *: I(3) ** I(4))
}

case class I(k: Int) {
  def ++(that: I): I = I(this.k + that.k)
  def +:(that: I): I = I(this.k + that.k)

  def **(that: I): I = I(this.k * that.k)
  def *:(that: I): I = I(this.k * that.k)
}

