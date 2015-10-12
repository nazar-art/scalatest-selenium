package math._0_set_theory._1_function._2_bijection

object Demo0 {

  // + totally defined
  // + injective
  // - surjective
  // - bijective function
  val toS: Int => String = k => String.valueOf(k)

  // - totally defined / partially defined
  // + injective
  // + surjective
  // - bijective function
  val toI: String => Int = s => s.toInt

}
