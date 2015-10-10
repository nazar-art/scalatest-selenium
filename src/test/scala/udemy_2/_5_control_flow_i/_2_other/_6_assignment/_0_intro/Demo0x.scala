package udemy_2._5_control_flow_i._2_other._6_assignment._0_intro

// 1. assign
// 2. lecture =?= spec
// 3. only 3 (classic, for loop, pattern matching)?
object Demo0x {

  // #1: "Classic"
  val x = 0                                         // spec: Assignment

  // #2: For loop
  for (k <- Array(0, 1, 2)) {                       // spec: 'Pattern' <- 'Expression'
    println(k)
  }

  // #3: Pattern matching
  def f(x: Any): String = x match {                 // spec: 'Pattern' <- 'Block'
    case k: Int => "Int:" + k
    case q => "NOT Int:" + q
  }


  val g = (k: Int) => k + 1                         // spec: 'Binding'

  val h = {                                         // spec: 'Binding'
    k: Int => k + 1
  }
}
