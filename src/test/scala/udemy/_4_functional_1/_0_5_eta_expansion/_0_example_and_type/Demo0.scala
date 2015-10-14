package udemy._4_functional_1._0_5_eta_expansion._0_example_and_type

// 1. eta-expansion: 'method' => 'function'
// 2. Explicit vs Implicit Eta-expansion
// 3. Function Type vs Method Type
object Demo0 extends App {

  // explicit eta-expansion
  val f0: (Int => Int) = m              // using target typing
  val f1 = m _                          // use partial application

  // implicit eta-expansion
  set(m)
  val list0 = List(0, 1, 2, 3) filter p map m                  // (2, 3, 4)
  // de-sugared variant
  val list1: List[Int] = List(0, 1, 2, 3).filter(p).map(m)     // (2, 3, 4)


  // =======================
  def m(x: Int): Int = x + 1              // mapper / transform
  def p(x: Int): Boolean = x > 0          // predicate
  def set(f: Int => Int) = ???            // consumer of Functional Value

}
