package udemy_2.CATEGORY_I._0_intro

// C[T] + (f: ?A=>B?) = (C[A] => C[B])
abstract class C[A] {

  /* covariant functor example
  trait C[A] {
    def fun[B](f: A => B): C[B]
  }*/

  // covariant functor
  def map[B](f: A => B): C[A] => C[B]

  // contravariant functor
  def contramap[B](f: B => A): C[A] => C[B]

  // exponential functor
  def xmap[B](f: (A => B, B => A)): C[A] => C[B]

  // applicator functor
  def apply[B](f: C[A => B]): C[A] => C[B]

  // monad
  def flatMap[B](f: A => C[B]): C[A] => C[B]

  // comonad
  def coflatMap[B](f: C[A] => B): C[A] => C[B]


}
