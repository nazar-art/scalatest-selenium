package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._1_product

// Math / Ordered Pair, N-Tuple ~ Scala / Tuple
object Demo0 extends App {
  private val x: (Int, String) = (0, "A")

  println(x._1)
  println(x._2)

  println()

  private val y: (Int, String, (Int, Int), Boolean) = (0, "A", (1, 2), true)

  println(y._1)
  println(y._2)
  println(y._3)
  println(y._3._1)
  println(y._3._2)
  println(y._4)
}
