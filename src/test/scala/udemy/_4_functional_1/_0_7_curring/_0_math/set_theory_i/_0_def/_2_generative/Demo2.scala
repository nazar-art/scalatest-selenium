package udemy._4_functional_1._0_7_curring._0_math.set_theory_i._0_def._2_generative

// set ~ generative / Stream
object Demo2 extends App {

  val fibonacci: Stream[BigInt] =
    0 #:: 1 #:: (fibonacci zip fibonacci.tail).map {t => t._1 + t._2}

  // fibs       = 0 1 1 2 3 5 ...
  // fibs.tail  = 1 1 2 3 5 ...
  // map {_ + _}
  //              1 2 3 5 8 ...

  fibonacci.take(50).print(" ")
}
