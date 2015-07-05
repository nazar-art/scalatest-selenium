package udemy.intro.companionObject.typeDiff

trait T
class C
object O

object Demo {
  val x: T = null
  val y: C = null
//  val z: O = null
  val z: O.type = null


}
