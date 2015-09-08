package udemy._for_comprehention._x_operators._8_unary._2

object Demo extends App {
  val x0 = +I(0)
  val x1 = -I(0)
  val x2 = !I(0)
  val x3 = ~I(0)

  val y0 = I(0).unary_+()
  val y1 = I(0).unary_-()
  val y2 = I(0).unary_!()
  val y3 = I(0).unary_~()

  println(x0)
  println(y0)
}

case class I(k: Int) {
  def unary_+(): I = I(2 * this.k)
  def unary_-(): I = I(2 * this.k)
  def unary_!(): I = I(2 * this.k)
  def unary_~(): I = I(2 * this.k)

  // not allowed second time
  /*def unary_$plus(): I = I(2 * this.k)
  def unary_$minus(): I = I(2 * this.k)
  def unary_$bang(): I = I(2 * this.k)
  def unary_$tilde(): I = I(2 * this.k)*/

}