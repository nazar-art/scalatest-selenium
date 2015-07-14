package udemy._for_comprehention._1_point_free

object Demo1 extends App {
  val cos: Double => Double = Math.cos
  val sin: Double => Double = Math.sin

  val f: Double => Double = x => cos(sin(x))

  // "point-free" style
  val g: Double => Double = cos compose sin
}

/**
 * Norma:
 * ДЛЯ ВСЯКОГО АРГУМЕНТА x функція  f еквіалентна
 * зістосуванню cos до результату застосування sin до цього х
 *
 * Point-free:
 * функція g еквіалентна застосуванню cos після застосування sin
 */
