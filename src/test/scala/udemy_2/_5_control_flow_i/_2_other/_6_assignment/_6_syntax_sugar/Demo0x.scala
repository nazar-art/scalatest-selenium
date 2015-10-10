package udemy_2._5_control_flow_i._2_other._6_assignment._6_syntax_sugar

// Theme OOP
// SYNTAX SUGAR: xxx_=
// Property-style
object Demo0x extends App {
  val c = new C0
  c.x = 1           // write ...
  c.x_=(1)          // write ...

  println(c.x)      // read ...
}

class C0 {
  def x_=(k: Int): Unit = println("write ...")

  def x: Int = {
    println("read ..."); 0
  }
}
