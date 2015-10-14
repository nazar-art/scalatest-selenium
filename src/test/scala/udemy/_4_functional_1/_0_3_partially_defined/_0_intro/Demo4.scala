package udemy._4_functional_1._0_3_partially_defined._0_intro

object Demo4 extends App {

  val f: PartialFunction[Int, String] = new PartialFunction[Int, String] {

    override def isDefinedAt(x: Int): Boolean = x match  {
      case 1 | 2 | 3 => true
      case _ => false
    }

    override def apply(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => throw new MatchError(x)
    }
  }

  println(f(2))
  println(f(4))
}
