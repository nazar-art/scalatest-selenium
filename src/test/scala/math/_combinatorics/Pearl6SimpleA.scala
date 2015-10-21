package math._combinatorics

object Pearl6SimpleA extends App {

  def partitions[A](arg: List[A]): List[List[List[A]]] =
    List(arg) :: (1 until arg.length).flatMap(
      k => partitions(arg drop k) map ((arg take k) :: _)
    ).toList

  partitions(List(1, 2, 3, 4))
    .filter(_.map(_.product).sum == 10)
    .map(_.map(_.mkString(" * ")).mkString(" + "))
    .foreach(println)

}
