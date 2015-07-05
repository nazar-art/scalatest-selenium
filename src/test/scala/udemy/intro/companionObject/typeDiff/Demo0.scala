package udemy.intro.companionObject.typeDiff

//trait T
//class C
object OT extends T
object OC extends C

object Demo0 {
  def f(x: T): Unit = ???

  f(new T {})
  f(OT)

  def g(arg: C): Unit = ???

  g(new C)
  g(OC)

  def r(arg: Any): String = arg match {
    case _: T => "T"
    case _: C => "C"

    case OT => "OT"
    case _: OT.type => "OT"

    case OC => "OC"
    case _: OC.type => "OC"
  }
}
