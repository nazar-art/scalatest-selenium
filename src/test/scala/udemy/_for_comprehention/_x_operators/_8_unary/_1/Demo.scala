package udemy._for_comprehention._x_operators._8_unary._1

object Demo extends App {
  val x0 = +I(0)
  val x1 = -I(0)
  val x2 = !I(0)
  val x3 = ~I(0)

  println(x0)
}

case class I(k: Int) {
  def unary_+(): I = I(2 * this.k)
  def unary_-(): I = I(2 * this.k)
  def unary_!(): I = I(2 * this.k)
  def unary_~(): I = I(2 * this.k)
}
