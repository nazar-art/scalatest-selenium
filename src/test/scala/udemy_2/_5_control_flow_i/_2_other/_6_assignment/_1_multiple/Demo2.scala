package udemy_2._5_control_flow_i._2_other._6_assignment._1_multiple

// SYNTAX SUGAR: (?, ?, ?) == Tuple3(?, ?, ?)
// SYNTAX SUGAR: Pattern Matching
object Demo2 extends App {

  // x = 0
  // y = 1
  // z = 2
  val Tuple3(x, y, z) = Tuple3(0, 1, 2)
}
