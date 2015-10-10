package udemy._2_control_flow_1._1_if

object Demo2 extends App {

  val x = if (System.currentTimeMillis() > 0) "0" else 1
  // type of x?

  val y: Any = if (System.currentTimeMillis() > 0) "0" else 1
}
