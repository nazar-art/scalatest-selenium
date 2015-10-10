package udemy_2._5_control_flow_i._2_other._6_assignment._1_multiple

object Demo4 extends App {

  def minMax(x: Int, y: Int): (Int, Int) = if (x < y) (x, y) else (y, x)

  val (min, max) = minMax(1, 0)
  val min2, max2 = minMax(1, 0)

  println(min, max)
  println(min2, max2)
}
