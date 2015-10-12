package math._0_set_theory._1_function._3_composition

object Demo0 {

  // 123 => "123"
  val f: Int => String = k => k.toString

  // "123" => ['1', '2', '3']
  val g: String => Array[Char] = s => s.toCharArray

  // 123 => ['1', '2', '3']
  val h0: Int => Array[Char] = g compose f

  // 123 => ['1', '2', '3']
  val h1: Int => Array[Char] = f andThen g


}
