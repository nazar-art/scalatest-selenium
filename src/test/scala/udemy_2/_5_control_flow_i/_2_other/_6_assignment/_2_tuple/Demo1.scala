package udemy_2._5_control_flow_i._2_other._6_assignment._2_tuple

// id = expr
// PATTERN = expr
// Theme: Case Classes + Pattern Matching
object Demo1 extends App {

  val person = new Person("Mike", 45)

  // #1: 'Classic'
  var Person(name0, age0) = person

  // #2: For Loop
  for (Person(name1, age1) <- Array(person, person, person)) {
    printf("name = %s, age = %d\n", name1, age1)
  }

  // #3: Pattern Matching
  def f(x: Any): String = x match {
    case Person(name2, age2) => "name = " + name2 + " age = " + age2
  }

}

case class Person(name: String, age: Int)
