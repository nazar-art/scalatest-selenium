package udemy.intro

object ArrayVsObject {
  val arr: Array[Int] = Array(0, 1, 2, 3)
  var elem: Int = arr(2)
  println(elem)

  val list: List[Int] = List(0, 1, 2, 3)
  var elem2: Int = list(2)
  println(elem2)
}
