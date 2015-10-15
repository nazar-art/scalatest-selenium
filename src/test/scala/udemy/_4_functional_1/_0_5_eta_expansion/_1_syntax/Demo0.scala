package udemy._4_functional_1._0_5_eta_expansion._1_syntax

// (Int)Int to Int => Int
object Demo0 extends App {

  def m(k: Int) = k + 1

//  val f0 = m                    // Error: missing argument for method m(Int)
  val f1: Int => Int = m          // target typing

  val f2 = m _                    // partially applied
  val f3 = m(_)                   // partially applied
}
