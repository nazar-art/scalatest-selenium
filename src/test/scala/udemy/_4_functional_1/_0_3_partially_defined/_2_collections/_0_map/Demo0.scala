package udemy._4_functional_1._0_3_partially_defined._2_collections._0_map

object Demo0 extends App {

  case class Person(name: String, age: Int)

  private val persons: List[Person] = List(Person("Mike", 45), Person("Sara", 12))


  private val adult0: List[Person] = persons filter {p => p.age >= 18}

  private val adult1: List[Person] = persons filter {_.age >= 18}

  private val adult2: List[Person] = persons filter {case Person(_, age) => age >= 18}

  private val adult3: List[Person] = persons filter {case Person(_, age) if age > 0 => true}

  println(adult0)
  println(adult1)
  println(adult2)
  println(adult3)
}
