package udemy._5_generics_1._4_scala_generics._0._0_base_case._3_field



// + class Holder[T](var value: T)
// + class Holder[T](val value: T)

// - class Holder[+T](var value: T)
// + class Holder[+T](val value: T)

// - class Holder[-T](var value: T)
// - class Holder[-T](val value: T)

class Holder[T](var value: T)
