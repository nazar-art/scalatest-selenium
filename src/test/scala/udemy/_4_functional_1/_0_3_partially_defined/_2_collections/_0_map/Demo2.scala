package udemy._4_functional_1._0_3_partially_defined._2_collections._0_map

object Demo2 extends App {

  println(List(0, 1, 2) collect { case 1 => "one"; case 2 => "two" })

  println(List(0, 1, 2) collectFirst { case 1 => "one"; case 2 => "two" })


  // filter only int
  println(List(0, "*", 2) collect { case x: Int => x })

  // filter only int and map x => x * x
  println(List(0, "*", 2) collect { case x: Int => x * x })

}
