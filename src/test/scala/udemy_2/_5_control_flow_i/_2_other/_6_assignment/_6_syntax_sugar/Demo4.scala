package udemy_2._5_control_flow_i._2_other._6_assignment._6_syntax_sugar

object Demo4 extends App {
  val c = new C2

  c(0)
  c(0, true)
  c(0, true, "A")

  println()
  c.apply(0)
  c.apply(0, true)
  c.apply(0, true, "A")
}

class C2 {
  def apply(x: Int): Unit = println("apply(I)")

  def apply(x: Int, b: Boolean): Unit = println("apply(I, B)")

  def apply(x: Int, b: Boolean, s: String): Unit = println("apply(I, B, S)")
}
