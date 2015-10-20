package udemy._5_generics_1._1_java_arrays;

// static VS dynamic typing
//      static typing  == all expression types known to compiler
//      dynamic typing == all expression types know to run time
// strong VS weak typing
//      strong typing == every memory area has unchanged type
//      weak typing == memory areas can change types (casts)
// ----
// Java has strong static type system

// Java has TWO type systems: compile-time + run-time
//      Java arrays are "weak" in compile-time type system
//      Java arrays are "strong" in run-time type system
public class Demo0 {
    // Java arrays are COVARIANT == Type operator T -> T[] are covariant  == Child[] <: Parent[]
    public static void main(String[] args) {
        String[] strArr = new String[1];
        Object[] objArr = strArr;               // String[] <: Object[]
        objArr[0] = new Integer(42);            // Integer  <: Object
        String str = strArr[0];                 // Integer(42) => String
    }
}
