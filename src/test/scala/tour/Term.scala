package tour

abstract class Term

case class Var(name: String) extends Term

case class Fun(arg: String, body: Term) extends Term

case class App(f: Term, v: Term) extends Term

object TermTest {
  def print(term: Term): Unit = term match {
    case Var(n) =>
      Console.print(n)
    case Fun(x: String, b: Term) =>
      Console.print("^" + x + ".")
      print(b)
    case App(f: Term, v: Term) =>
      Console.print("(")
      print(f)
      Console.print(" ")
      print(v)
      Console.print(")")
  }

  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }

  def main(args: Array[String]) {
    val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
    val id = Fun("x", Var("x"))

    print(t)
    println()
    println(isIdentityFun(id))
    println(isIdentityFun(t))
  }
}