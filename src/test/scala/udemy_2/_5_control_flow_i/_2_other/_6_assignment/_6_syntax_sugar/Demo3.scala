package udemy_2._5_control_flow_i._2_other._6_assignment._6_syntax_sugar

// SYNTAX SUGAR: update
object Demo3 {
  val arr = Array[Array[Int]]()

  arr(1)(2) = 0

  arr.apply(1).update(2, 0)

}
