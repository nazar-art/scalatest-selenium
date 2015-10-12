package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._0_def._2_generative

// set ~ generative form
object Demo0 extends App {

  def applyWhile0[A](set: Iterable[A], func: A => Boolean): Unit = {
    val iter: Iterator[A] = set.iterator
    while (iter.hasNext) {
      val elem: A = iter.next()
      val needMore: Boolean = func(elem)
      if (!needMore) {
        return
      }
    }
  }

  def applyWhile1[A](set: Iterable[A], func: A => Boolean): Unit = {
    for (elem <- set) {
      if (!func(elem)) return
    }
  }

  def applyWhile2[A](set: Iterable[A], func: A => Boolean): Unit = {
    set.iterator.takeWhile(func)
  }
}
