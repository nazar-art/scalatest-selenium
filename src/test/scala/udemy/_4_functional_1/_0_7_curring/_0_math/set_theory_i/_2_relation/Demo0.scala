package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._2_relation

object Demo0 extends App {

  val lt: (Int, Int) => Boolean = _ < _
  val le: (Int, Int) => Boolean = _ <= _
  val eq: (Int, Int) => Boolean = _ == _
  val dv: (Int, Int) => Boolean = _ % _ == 0

  def showRelation(range: Range, rel: (Int, Int) => Boolean) = {
    for (i <- range) {
      for (j <- range) {
        print(if (rel(i, j)) " +" else " -")
      }
      println()
    }
  }

  println("<")
  showRelation(1 to 4, lt)

  println("\n<=")
  showRelation(1 to 4, le)

  println("\n==")
  showRelation(1 to 4, eq)

  println("\n%")
  showRelation(1 to 4, dv)
}
