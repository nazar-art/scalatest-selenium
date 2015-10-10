package udemy_2._5_control_flow_i._2_other._6_assignment._0_intro

object Demo7 extends App {

  var c = new C(0)
  c ?= 1        // c = c ? 1 or c.?(1)
  println(c.value)
}

class C(val value: Int) {
  def ?(k: Int): C = new C(value + k)
}
