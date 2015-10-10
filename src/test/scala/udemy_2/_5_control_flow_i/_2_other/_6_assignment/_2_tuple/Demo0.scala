package udemy_2._5_control_flow_i._2_other._6_assignment._2_tuple

object Demo0 extends App {

  val tuple = (0, "A", true)

  // #1: 'Classic'
  val (x0, y0, z0) = tuple

  // #2: For Loop
  for ((x, y, z) <- Array(tuple, tuple, tuple)) {
    printf("x = %d, y = %s, z = %b\n", x, y, z)
  }

  // #3: Pattern matching
  def f(x: Any): String = x match {
    case (x2: Int, y2: String, z2: Boolean) => "" + x2 + y2 + z2
    case (x3: Int, y3, z3: Boolean) => "" + x3 + y3 + z3
    case (x4, y4, z4) => "" + x4 + y4 + z4
  }
}
