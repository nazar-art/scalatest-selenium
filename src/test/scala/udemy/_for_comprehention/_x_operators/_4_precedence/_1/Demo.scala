package udemy._for_comprehention._x_operators._4_precedence._1

object Demo extends App {
  // 1 mul 2 mul 3 add 4 mul 5 mul 6 add 7 mul 8 mul 9
  // (((((((1 mul 2) mul 3) add 4) mul 5) mul 6) add 7) mul 8) mul 9
  println(I(1) mul I(2) mul I(3) add I(4) mul I(5) mul I(6) add I(7) mul I(8) mul I(9))

  // 1 * 2 * 3 + 4 * 5 * 6 + 7 * 8 * 9
  // (1 * 2 * 3) + (4 * 5 * 6) + (7 * 8 * 9)
  // ((1 * 2) * 3) + ((4 * 5) * 6) + ((7 * 8) * 9)
  // (((1 * 2) * 3) + ((4 * 5) * 6)) + ((7 * 8) * 9)
  println(I(1) * I(2) * I(3) + I(4) * I(5) * I(6) + I(7) * I(8) * I(9))
}

case class I(k: Int) {
  def add(that: I): I = I(this.k + that.k)
  def mul(that: I): I = I(this.k * that.k)

  def +(that: I): I = I(this.k + that.k)
  def *(that: I): I = I(this.k * that.k)
}

