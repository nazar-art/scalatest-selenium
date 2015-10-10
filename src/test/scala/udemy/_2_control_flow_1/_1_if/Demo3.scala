package udemy._2_control_flow_1._1_if

class Demo3 extends App {
  val x0 = if (System.currentTimeMillis() < 0) 0

  // compile time: type of 'x'?
  // run-time:     value of 'x'?

  val x1 = if (System.currentTimeMillis() < 0) 0 else {}

  val x2 = if (System.currentTimeMillis() < 0) 0 else ()

  val x3: AnyVal = if (System.currentTimeMillis() < 0) 0 else ()
}
