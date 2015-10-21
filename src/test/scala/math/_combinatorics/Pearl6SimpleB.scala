package math._combinatorics

object Pearl6SimpleB extends App {

  // 1*2 + 3 + 4 => ((1,2), (3), (4))
  def partitions[A](arg: List[A]): List[List[List[A]]] =
    List(arg) :: (1 until arg.length).flatMap(
      k => partitions(arg drop k) map ((arg take k) :: _)
    ).toList

  // ((1, 2), (3), (4)) => (1*2, 3, 4) => 1 * 2 + 3 + 4
  def eval(arg: List[List[Int]]): Int = arg.map(_.product).sum

  // ((1, 2), (3), (4)) => ("1*2", "3", "4") => "1*2 + 3 + 4"
  def toStr(arg: List[List[Int]]): String = arg.map(_.mkString("*")).mkString(" + ")

  partitions(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
    .filter(eval(_) == 100)
    .map(toStr)
    .foreach(println)

}
