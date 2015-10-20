package udemy._5_generics_1

object Demo0 extends App {

  val list = List("A", "B", "C")

//  println((list ::: List("*")).reverse.last)
//  println(list.tail.splitAt(2)._1.head)
//  println(list.init.splitAt(0)._2.tail)
//  println((list.reverse ::: list.reverse).take(4))
//  println(list.init ::: list.drop(1).init ::: list.drop(2).init)

  println(List(0, 1).flatMap(x => List(0, 1).flatMap(y => List(x, y))))
  println(List(0, 1).map(x => List(0, 1).flatMap(y => List(x, y))))
  println(List(0, 1).flatMap(x => List(0, 1).map(y => List(x, y))))
  println(List(0, 1).map(x => List(0, 1).map(y => List(x, y))))

}
