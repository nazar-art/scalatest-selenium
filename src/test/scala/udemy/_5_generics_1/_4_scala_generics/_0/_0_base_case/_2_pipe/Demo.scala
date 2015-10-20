package udemy._5_generics_1._4_scala_generics._0._0_base_case._2_pipe

class A
class B extends A
class C extends B

class Pipe[T] {
  def read: T = ???                 // co-variant position
  def func(arg: T): T = ???
  def write(arg: T): Unit = ???     // contra-variant position
}

object Demo extends App {

  def f(pipe: Pipe[B]): Unit = {
    val x: B = pipe.read
    pipe.write(new B)
  }

  f(new Pipe[B])
}
