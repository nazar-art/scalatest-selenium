package udemy_2._5_control_flow_i._2_other._6_assignment._6_syntax_sugar

// Theme OOP
// SYNTAX SUGAR: xxx_=
// Property-style
object Demo0y extends App {
  val t = new Thermometer

  t.celsius = 1             // write
  t.fahrenheit = 1          // write

  println(t.celsius)        // read
  println(t.fahrenheit)     // read

  println(t)
}

// "Programming in Scala", 2 edition
class Thermometer {
  var celsius: Float = _

  // read
  def fahrenheit = celsius * 9 / 5 + 32

  // write
  def fahrenheit_=(f: Float): Unit = {
    celsius = (f - 32) * 5 / 9
  }

  override def toString: String = fahrenheit + "F/" + celsius + "C"
}
