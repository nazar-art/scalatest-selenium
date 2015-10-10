package udemy_2._5_control_flow_i._2_other._6_assignment._1_multiple

object Demo0 extends App {
  val x, y, z = new Holder(0)
}

class Holder(var value: Int) {
  print("new instance....... ")
}
