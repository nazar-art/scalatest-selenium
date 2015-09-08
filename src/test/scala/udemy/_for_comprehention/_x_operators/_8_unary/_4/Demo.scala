package udemy._for_comprehention._x_operators._8_unary._4

object Demo extends App {
  val x0 = I(0).+()
  val x1 = I(0).-()
  val x2 = I(0).!()
  val x3 = I(0).~()

  // parentless notation
  val y0 = I(0).+
  val y1 = I(0).-
  val y2 = I(0).!
  val y3 = I(0).~

  // postfix notation
  val z0 = I(0) +
  val z1 = I(0) -
  val z2 = I(0) !
  val z3 = I(0) ~
}

// NOT prefix! postfix!
case class I(k: Int) {
  def +(): I = I(2 * this.k)

  def -(): I = I(3 * this.k)

  def !(): I = I(4 * this.k)

  def ~(): I = I(5 * this.k)
}
