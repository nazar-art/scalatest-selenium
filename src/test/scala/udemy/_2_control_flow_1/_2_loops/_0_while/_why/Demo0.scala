package udemy._2_control_flow_1._2_loops._0_while._why

object Demo0 extends App {

  invokeIfYouWant(while (true) println(0))

  // call-by-name NOT call-by-value (~ lazy/every-time evaluation)
  def invokeIfYouWant(body: => Unit): Unit = {
    if (System.currentTimeMillis() % 2 == 0) {
      body
    }
  }
}
