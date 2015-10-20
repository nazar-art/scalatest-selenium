package math._combinatorics

object _2_PermLib extends App {

  def perm0[A](list: List[A]): List[List[A]] = list.permutations.toList

  def perm1[A](list: List[A]): List[List[A]] =
    if (list.length == 1)
      List(list)
    else list.indices
      .flatMap(k => perm1(list.patch(k, Nil, 1)).map(list(k) :: _)).toList
  
  def perm2[A](list: List[A]): List[List[A]] =
    if (list.length == 1)
      List(list)
    else perm2(list.tail)
      .flatMap(mix => (0 to mix.length).map(mix.patch(_, List(list.head), 0)))



  println(perm0(List("a", "b", "c")))
  println(perm1(List(0, 1, 2)))
  println(perm2(List(0, 1, 2, 3)))
}
