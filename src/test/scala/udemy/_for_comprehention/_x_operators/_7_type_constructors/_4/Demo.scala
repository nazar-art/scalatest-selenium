package udemy._for_comprehention._x_operators._7_type_constructors._4

// NO argument inverse for last ':'
// YES right associativity for last ':'
// NO precedence
object Demo {
  val x0: Int ++ String ** Boolean = ???

  val x1: Int +: String *: Boolean = ???

  val x2: Int +: (String ** Boolean) = ???

  val x3: (Int ++ String) *: Boolean = ???

}

// type constructors
case class ++[A, B](a: A, b: B)
case class **[A, B](a: A, b: B)

case class +:[A, B](a: A, b: B)
case class *:[A, B](a: A, b: B)