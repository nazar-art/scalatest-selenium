package udemy._for_comprehention._x_operators._4_precedence

object Demo0 extends App {
  // 1 add 2 mul 3  => (1 add 2) mul 3
  // 1  +  2  *  3  =>  1  +  (2  *  3)

  println(I(1) add I(2) mul I(3))
  println(I(1) + I(2) * I(3))
}

case class I(k: Int) {
  def add(that: I): I = I(this.k + that.k)
  def mul(that: I): I = I(this.k * that.k)

  def +(that: I): I = I(this.k + that.k)
  def *(that: I): I = I(this.k * that.k)
}

