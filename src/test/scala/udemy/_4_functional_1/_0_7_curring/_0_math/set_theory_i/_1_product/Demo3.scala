package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._1_product

object Lib {
  implicit class SetWrapper[A](set0: Set[A]) {
    def *[B](set1: Set[B]): Set[(A, B)] = {
      for (elem0 <- set0; elem1 <- set1) yield (elem0, elem1)
    }
  }
}

object Demo3 extends App {
  import Lib._

  private val strings: Set[Char] = Set('A', 'B', 'C')
  private val ints: Set[Int] = Set(0, 1)

  println(strings * ints)

}
