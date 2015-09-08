package udemy._for_comprehention._x_operators._test_precedence_associativity

object Demo0 extends App {
//  C(0) ::: C(1) +++ (C(2) ::: C(3))
//  (C(0) ::: C(1)) +++ (C(2) ::: C(3))
//  C(0) +++ C(1) ::: C(2) +++ C(3)
//  C(0) +++ (C(1) ::: C(2)) +++ C(3)
//  (C(0) +++ C(1) ::: C(2)) +++ C(3)
//  C(0) +++ (C(1) ::: C(2) +++ C(3))
  C(0) +++ ((C(1) ::: C(2)) +++ C(3))
}

case class C(value: Int) {

  def :::(that: C): C = {
    print(this.value) // THIS!
    that              // THAT!
  }

  def +++(that: C): C = {
    print(this.value) // THIS!
    that              // THAT!
  }
}