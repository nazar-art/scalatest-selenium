package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._0_def._1_pred

object Lib {
  type BigIntSet = BigInt => Boolean

  implicit class TmpWrapper[A](p0: A => Boolean) {
    def ?(elem: A): Boolean = p0(elem)

    def |(p1: A => Boolean): A => Boolean = x => p0(x) | p1(x)

    def &(p1: A => Boolean): A => Boolean = x => p0(x) & p1(x)
  }
}

object Demo1 extends App {
  import Lib._

  val set0: BigIntSet = _ > 10
  val set1: BigIntSet = _ < 20
  val set2: BigIntSet = _ % 2 == 0

  val set = (set0 & set1) | set2
  println(set ? 42)
  println(set ? 43)
}
