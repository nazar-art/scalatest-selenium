package udemy._4_functional_1._0_5_eta_expansion._0_example_and_type

object Demo2 extends App {

  // ================= 0 argument
  def m0(): Int = 0                 // type: ()Int

  val f0: () => Int = () => 0       // type: () => Int

  // ================= 1 argument
  def m1(x: Int): Int = x + 1       // type: (Int)Int

  val f1: Int => Int = _ + 1        // type: Int => Int

  // ================= 1+ arguments
  def m2(x: Int, y: Int): Int = x + y      // type: (Int, Int)Int

  val f2: (Int, Int) => Int = _ + _        // type: (Int, Int) => Int
}
