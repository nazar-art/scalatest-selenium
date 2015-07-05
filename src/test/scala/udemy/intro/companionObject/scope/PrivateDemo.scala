package udemy.intro.companionObject.scope

class PrivateDemo {
  private val classPrivate = 0
  val tmp: Int = PrivateDemo.objectPrivate
}

object PrivateDemo {
  private val objectPrivate = 0
  val tmp: Int = new PrivateDemo().classPrivate
}
