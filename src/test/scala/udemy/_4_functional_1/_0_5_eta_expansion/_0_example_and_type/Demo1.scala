package udemy._4_functional_1._0_5_eta_expansion._0_example_and_type

object Demo1 extends App {

  def m(x: Int): Int = x + 1

  // Lambda Term (Lambda Calculus, Haskell) == Functional literal (Scala)
  val f0: (Int => Int) = x => m(x)
  val f1: (Int => Int) = m

  // in theory:     f0 != f1
  // in practice:   f0 == f1
}
