package udemy.intro.companionObject.parenteless

class Demo {
  // f0 == f1
  // g0 == g1
  // {f0, f1} != {g0, g1}

  def f0 = 1

  def f1: Int = 1


  def g0() = 1

  def g1(): Int = 1
}

object DemoTest extends App {
  new Demo().f0
  // not allowed
  //  new Demo().f0()

  new Demo().g0
  new Demo().g0()
}
