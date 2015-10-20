package math._combinatorics

object _4_SubList extends App {

  def sub[A](list: List[A]): List[List[A]] =
    if (list.length == 1)
      List(Nil, list)
    else
      sub(list.tail).flatMap(s => List(s, list.head :: s))


  sub(List("A", "B", "C")).foreach(println)
}
