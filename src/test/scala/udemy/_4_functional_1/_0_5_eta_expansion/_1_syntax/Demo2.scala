package udemy._4_functional_1._0_5_eta_expansion._1_syntax

object Demo2 extends App {

  // overloaded version
  def m(x: Int) = x + 1
  def m(x: Int, y: Int) = x + y

  //  val f0 = m                         // Error: missing argument for method m(Int)
  val f1: (Int) => Int = m               // target typing
  val f2: (Int, Int) => Int = m          // target typing

//  val f3 = m                             // Compilation Error: Can not resolve symbol 'm'
//  val f4 = m(_, _)                       // Runtime Error: missing parameter type for expanded function
//  val f5 = m(_)                          // Runtime Error: missing parameter type for expanded function

  val f6 = m(_: Int, _:Int)              // partial application
  val f7 = m(_:Int)                      // partial application

  println(f6(1, 2))
  println(f7(1))
}
