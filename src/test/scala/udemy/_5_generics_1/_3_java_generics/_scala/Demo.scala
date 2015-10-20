package udemy._5_generics_1._3_java_generics._scala

// Java:  Use defined variance
// Scala: DEFINITION defined variance

// [T] = non-variant
// [+T] = co-variant
// [-T] = contra-variant

class MyClass[T]
//class MyClass[+T]
//class MyClass[-T]

object Demo extends App {

//  val x: MyClass[Object] = new MyClass[String]

//  val y: MyClass[String] = new MyClass[Object]

  val z: MyClass[String] = new MyClass[String]
}
