package udemy._4_functional_1._0_5_eta_expansion._1_syntax

object Demo3x extends App {

  val f0 = println                    // Crazy style: call and save 'Unit'
  val f1: Unit = println              // Crazy style: call and save 'Unit'
  val f2: Unit = println()            // Ok (do you really need Unit instance?)

  val f3 = println                    // Error
  val f4: () => Unit = println        // Ok: explicit target typing
  val f5: Int => Unit = println       // Ok: explicit target typing

}
