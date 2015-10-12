package udemy._4_functional_1._0_3_partially_defined._1_api

object Demo2 extends App {

  val f: PartialFunction[Int, String] = {  case 1 => "one"  }
  val g: PartialFunction[Int, String] = {  case 2 => "two"  }
  val h: PartialFunction[Int, String] = {  case 3 => "three"  }

  private val x: PartialFunction[Int, String] = f orElse g orElse h
  println(x.apply(1))
  println(x.apply(5))
}
