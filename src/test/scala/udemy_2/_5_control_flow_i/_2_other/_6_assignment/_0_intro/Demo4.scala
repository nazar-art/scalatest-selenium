package udemy_2._5_control_flow_i._2_other._6_assignment._0_intro

// Scala: Assign IS Expression (with Unit type)
object Demo4 {

  var x: Int = 0

  // but Unit type
  val y0: Unit = x = 1

  // Like Java
  val y1: Int = {
    x = 1; x
  }
}
