package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._0_def._1_pred

object Demo2 extends App {

  def applyWhile(set: Int => Boolean, func: Int => Boolean): Unit = {
    for (k <- Int.MinValue to Int.MaxValue) {
      if (set(k)) {
        val needMore: Boolean = func(k)
        if (!needMore) {
          return
        }
      }
    }
  }

  // print 3 first elements
  def print3(set: Int => Boolean): Unit = {
    applyWhile(set, new Function[Int, Boolean] {
      var count = 0
      override def apply(elem: Int): Boolean = {
        print(elem)
        count += 1
        count < 3
      }
    })
  }

}
