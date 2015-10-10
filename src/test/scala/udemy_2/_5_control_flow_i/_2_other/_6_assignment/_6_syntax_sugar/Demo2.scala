package udemy_2._5_control_flow_i._2_other._6_assignment._6_syntax_sugar

object Demo2 extends App {

  val arr = Array(0, 1, 2)

  printArr()

  arr(1) = 0
  printArr()

  arr.update(2, 0)
  printArr()


  def printArr() {
    for (k <- arr) {
      print(k + " ")
    }
    println()
  }
}
