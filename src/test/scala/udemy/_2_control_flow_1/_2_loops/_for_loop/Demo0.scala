package udemy._2_control_flow_1._2_loops._for_loop

object Demo0 extends App {
  // For Loop: for without 'yield'
  for (k <- List(0, 1, 2)){
    println(k * k)
  }

  // For Comprehension: 'for' with 'yield'
  val ref: List[Int] = for (k <- List(0, 1, 2)) yield k * k
}
