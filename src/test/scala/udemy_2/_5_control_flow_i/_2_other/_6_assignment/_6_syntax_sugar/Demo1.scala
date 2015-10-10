package udemy_2._5_control_flow_i._2_other._6_assignment._6_syntax_sugar

// SYNTAX SUGAR: update
object Demo1 extends App {
  val c = new C1

  c() = 0                   // update(I)
  c.update(0)               // update(I)

  c(true) = 0               // update(B, I)
  c.update(true, 0)         // update(B, I)

  c("A", true) = 0          // update(S, B, I)
  c.update("A", true, 0)    // update(S, B, I)
}

class C1 {
  def update(k: Int): Unit = println("update(I)")

  def update(b: Boolean, k: Int): Unit = println("update(B, I)")

  def update(s: String, b: Boolean, k: Int): Unit = println("update(S, B, I)")
}
