package udemy._4_functional_1._0_3_partially_defined._2_collections._1_map

object Demo1 extends App {

  println(List(0, 1, 2) collect Map(1 -> "one", 2 -> "two" ))
}
