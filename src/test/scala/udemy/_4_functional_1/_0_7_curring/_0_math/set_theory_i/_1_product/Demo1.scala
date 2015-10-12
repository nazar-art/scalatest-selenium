package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._1_product

object Demo1 extends App {

  // for
  def prod0[A, B](set0: Set[A], set1: Set[B]): Set[(A, B)] = {
    var result = Set[(A, B)]()
    for (elem0 <- set0) {
      for (elem1 <- set1) {
        result = result + ((elem0, elem1))
      }
    }
    result
  }

  // for
  def prod1[A, B](set0: Set[A], set1: Set[B]): Set[(A, B)] = {
    var result = Set[(A, B)]()
    for (elem0 <- set0; elem1 <- set1) {
        result = result + ((elem0, elem1))
    }
    result
  }

  // for + yield
  def prod2[A, B](set0: Set[A], set1: Set[B]): Set[(A, B)] = {
    for (elem0 <- set0; elem1 <- set1) yield (elem0, elem1)
  }

  // map + flat map
  def prod3[A, B](set0: Set[A], set1: Set[B]): Set[(A, B)] = {
    set0.flatMap(elem0 => set1.map(elem1 => (elem0, elem1)))
  }

  private val strings: Set[Char] = Set('A', 'B', 'C')
  private val ints: Set[Int] = Set(0, 1)

  private val res0: Set[(Char, Int)] = prod1(strings, ints)

  println(res0)
}
