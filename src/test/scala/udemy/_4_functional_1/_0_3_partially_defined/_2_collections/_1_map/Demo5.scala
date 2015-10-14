package udemy._4_functional_1._0_3_partially_defined._2_collections._1_map

object Demo5 extends App {

  val f: Map[String, Int] = Map("0" -> 0, "1" -> 1)

  f.get("0") match {
    case Some(k) => println(k)
    case None => println("<undefined>")
  }

  println(f.get("0").getOrElse("<undefined>"))

  println(f.getOrElse("45", "<undefined>"))

  val x: Option[Int] = None
  val y: Option[Int] = Some(0)
  val z: Option[Int] = x orElse y
  println(z)
}
