package udemy._for_comprehention._x_operators._5_associativity._0

object Demo extends App {
  // 1 ++ 2 ++ 3 ++ 4
  // (1 ++ 2) ++ 3 ++ 4
  println(I(1) ++ I(2) ++ I(3) ++ I(4))
  println(I(1).++(I(2)).++(I(3)).++(I(4)))

  // x +: y = y.+:(x)

  // 1 +: 2 +: 3 +: 4
  // ((4 +: 3) +: 2) +: 1
  println(I(1) +: I(2) +: I(3) +: I(4))
  println(I(4).+:(I(3)).+:(I(2)).+:(I(1)))
}

case class I(k: Int) {
  def ++(that: I): I = I(this.k + that.k)
  def +:(that: I): I = I(this.k + that.k)
}