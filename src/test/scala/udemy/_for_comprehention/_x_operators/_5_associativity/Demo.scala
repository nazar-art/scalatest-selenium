package udemy._for_comprehention._x_operators._5_associativity

object Demo extends App {
  // 1 ++ 2 ++ 3 ++ 4
  // (1 ++ 2) ++ 3 ++ 4
  println(I(1) ++ I(2) ++ I(3) ++ I(4))

  // 1 +: 2 +: 3 +: 4
  // 1 +: (2 +: (3 +: 4))
  println(I(1) +: I(2) +: I(3) +: I(4))
}

case class I(k: Int) {
  def ++(that: I): I = I(this.k + that.k)
  def +:(that: I): I = I(this.k + that.k)
}

