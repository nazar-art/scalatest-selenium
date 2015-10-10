package udemy_2._5_control_flow_i._2_other._6_assignment._4_unapply

object Demo1 {

  var person = new Person("Mike", 45)

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

class Person(val name: String, val age: Int)

object Person {
  // must be presented follow method
  def unapply(p: Person): Option[(String, Int)] = Some(p.name, p.age)
}