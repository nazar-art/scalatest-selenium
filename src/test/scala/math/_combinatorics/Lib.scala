package math._combinatorics

object Lib {

  def perm[A](list: List[A]): List[List[A]] =
    if (list.length == 1) List(list)
    else list.indices.flatMap(k => perm(list.patch(k, Nil, 1)).map(word => list(k) :: word)).toList

  def part[A](arg: List[A]): List[List[List[A]]] =
    List(arg) :: (1 until arg.length).flatMap(k => part(arg drop k) map ((arg take k) :: _)).toList

  def sub[A](list: List[A]): List[List[A]] =
    if (list.length == 1) List(Nil, list)
    else sub(list.tail).flatMap(s => List(s, list.head :: s))

  def eval(arg: List[List[Int]]): Int = arg.map(_.product).sum

  def toStr(arg: List[List[Int]]): String = arg.map(_.mkString("*")).mkString(" + ")
}
