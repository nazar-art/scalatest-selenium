package udemy._4_functional_1._0_3_partially_defined._2_collections._1_map

object Demo3 extends App {

  private val f: Map[String, Int] = Map("0" -> 0, "1" -> 1)

  if (f.isDefinedAt("0")){
    println(f("0"))
  }

  f.runWith(println)("0")

  f.get("0").foreach(println)

}
