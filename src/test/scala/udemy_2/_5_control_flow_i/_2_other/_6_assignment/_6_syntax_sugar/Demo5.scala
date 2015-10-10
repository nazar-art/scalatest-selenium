package udemy_2._5_control_flow_i._2_other._6_assignment._6_syntax_sugar

object Demo5 extends App {

  val f0 = (k: Int) => k + 1
  val x0 = f0(1)
  println(x0)

  // the same as follows
  val f1 = new Function1[Int, Int] {
    override def apply(k: Int): Int = k + 1
  }

  val x1 = f1.apply(1)
  println(x1)
}
