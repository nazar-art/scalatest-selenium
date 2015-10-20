package udemy._4_functional_1._3_functional_type

// functional literal VS functional value
// function VS method
object Demo0 extends App {

  // LITERALS
  val x = 1
  val y = "Hello"
  val z = (s: String) => s.length         // function literal

  // types at BOTH sides
  val f0: Int => Int = (x: Int) => x + 1: Int

  // types at RIGHT side
  val f1 = (x: Int) => x + 1
  val f2 = (_: Int) + 1

  // types at LEFT side
  val f3: Int => Int = x => x + 1
  val f4: Int => Int = _ + 1

  // no types at all
//  val f5 = x => x + 1


//  (Int, String, Long) => Array[String]
  // the same
//  Function3[Int, String, Long, Array[String]]


  val f6: Function1[Int, Int] = (x: Int) => x + 1

  val f7: Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  val f8: Function[Int, Int] = new Function[Int, Int] {
    override def apply(x: Int): Int = x + 1
  }
}
