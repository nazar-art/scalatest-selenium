package udemy._4_functional_1._0_5_eta_expansion._1_syntax

// (Int, Int)Int to (Int, Int) => Int
object Demo1 extends App {

  def m(x: Int, y: Int) = x + y

  //  val f0 = m                          // Error: missing argument for method m(Int)
  val f1: (Int, Int) => Int = m          // target typing

  val f2 = m _                       // partially applied
  val f3 = m(_, _)                   // partially applied
}
