package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._0_def._0_set

object Demo0 extends App {
  private val set0: Set[Int] = Set(2, 0, 1)
  private val set1: Set[Int] = Set(3, 2, 4)

  // contains
  private val res0: Boolean = set0.contains(1)          // method form
  private val res1: Boolean = set0(1)                   // apply-form

  // union
  private val res2: Set[Int] = set0.union(set1)         // method form
  private val res3: Set[Int] = set0 | set1              // apply-form

  // intersection
  private val res4: Set[Int] = set0.intersect(set1)     // method form
  private val res5: Set[Int] = set0 & set1              // apply-form

  // use elem
  // external iteration
  for (elem <- set0) {
    println(elem)
  }

  // internal iteration
  set0.foreach(println)                                 // method form
  set0 foreach println                                  // operator form
}
