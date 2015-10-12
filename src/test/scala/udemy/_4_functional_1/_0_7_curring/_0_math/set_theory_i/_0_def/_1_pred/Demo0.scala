package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._0_def._1_pred

// set ~ predicative form
object Demo0 extends App {
  def contains[A](set: A => Boolean, elem: A): Boolean = set(elem)

  def union[A](set0: A => Boolean, set1:A => Boolean): A => Boolean =
    (x: A) => set0(x) | set1(x)

  def intersection[A](set0: A => Boolean, set1: A => Boolean): A => Boolean =
    (x: A) => set0(x) & set1(x)

  // Example
  // -------
  val set0: BigInt => Boolean = _ > 10        // {11, 12, 13, ... }
  val set1: BigInt => Boolean = _ < 20        // { ... 17, 18, 19}
  val set2: BigInt => Boolean = _ % 2 == 0    // { ... -4, -2, 0, 2, 4, ... }


  // { ... 6, 8, 10, 11, 12, 13,14,15,16,17,18,19,20,22,24 ... }
  val set = union(intersection(set0, set1), set2)
  println(set(42))
  println(set(43))

  //HelloCopyCom12345
  //nazar-lelyak@ukr.net
}
