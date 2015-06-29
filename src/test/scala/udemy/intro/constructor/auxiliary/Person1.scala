package udemy.intro.constructor.auxiliary

class Person1(var name: String = "Cay", var age: Int = 17)

object Person1Demo extends App {
  new Person1()

  new Person1("A")

  new Person1(age = 0)

  new Person1("0", 0)

}
