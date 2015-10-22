package udemy_2._for_comprehension._1_for_loop

object Demo0 {

  // For Loop
  for (k <- Array(0, 1, 2)) {
    println(k)
  }

  // translated
  Array(0, 1, 2).foreach(k => println(k))

  // For Comprehension
  val x0 = for (k <- Array(0, 1, 2))
  yield k * k

  // translated
  Array(0, 1, 2).map(k => k * k)
}
