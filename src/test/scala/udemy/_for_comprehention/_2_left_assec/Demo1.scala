package udemy._for_comprehention._2_left_assec

object Demo1 extends App {
  println(I(1) add I(2) mul I(3))

  // NOT recommended
  println(I(1) add I(2).mul(I(3)))

  // recommended
  println(I(1).add(I(2).mul(I(3))))
}
