package udemy._for_comprehention._0_infix

object Demo0 extends App {
  val x0 = I(1).add(I(2))
  val x1 = I(1) add I(3)

  println(x0)
  println(x1)
}

case class I(k: Int) {
  def add(that: I): I = I(this.k + that.k)
}
