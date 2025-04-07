//Exceptions and Assertions : Exception overview, Exception class hierarchy and exception types,
// Propagation of exceptions, Using try, catch and finally for exception handling, Usage of throw and
// throws, handling multiple exceptions using multi-catch, Autoclose resources with try-with resources
// statement, Creating custom exceptions, Testing invariants by using assertions


public class UNT4_Excpn_Hand {

    // =====================Error handling with TRY CATCH=============================

//     public static void main(String[] args) {
//         System.err.println("chlo bhai dekhte hai ");

// try {
//         String  a = "Hello";
// int b = Integer.parseInt(a);
// System.out.println(b);
//      }
// catch (NumberFormatException e) {
//             System.out.println("Invalid input");   
//     } 
//     System.err.println("khatam tata bye bye ");
// }
// }


// =====================Multi try catch =============================

// public static void main(String[] args) {
//     System.err.println("prgm bgns");
// try{
//     System.err.println(50/0);
// }

// catch(Exception e ){
//     System.err.println("Abey tu thoda sa bhn ka loda hai kya");

// }

// try{
//     int[] arr={10,20,30,40};
//     System.err.println(arr[7]);
// }
// catch(Exception e){
//     System.err.println("Error hai Error hai ");
//     System.err.println("Nhi bhai Exception hai Exceptioin hai");
// }

//     System.err.println("prgm ends");
// }

// =====================multi catch block=============================


// public static void main(String[] args) {
//     System.out.println("prgm bgns");
// try{
//     System.out.println(50/0);
//     int[] arr={10,20,30,40};
//     System.out.println(arr[7]);
// }
// catch(ArithmeticException e){
//     System.out.println("divide by zero error ");
// }
// catch(ArrayIndexOutOfBoundsException f){
//     System.out.println("Array index out of bound ");
// }
// catch(Exception g){
//     System.out.println("General Exception ");
// }

//     System.out.println("prgm ends");
// }

// ====================Nested try catch block================
// public static void main(String[] args) {
//     System.out.println("prgm bgns");
//     try{
//         System.out.println(50/0);
//         }
//         catch(ArithmeticException e){
//             System.out.println("divide by zero error ");
//             try{
//                 int[] arr={10,20,30,40};
//                 System.out.println(arr[7]);
//                 }
//                 catch(ArrayIndexOutOfBoundsException f){
//                     System.out.println("Array index out of bound ");
//                     }
//                     catch(Exception g){
//                         System.out.println("General Exception ");
//                         }
//                         }
//                         System.out.println("prgm ends");
//                         }


// public static void main(String[] args) {
//     System.out.println("prgm bgns");
//     try{
//         System.out.println(50/0);
//         }   
//         catch(ArithmeticException e){
//             try{
//             System.out.println(15/0 );
//             }
// }

// public static void main(String[] args) {
//     System.out.println("before try catch");
//     try{
//         System.out.println("inside try block");
//         System.out.println(50/10);
//         System.out.println("after exception");
//     }
//     catch(ArithmeticException e){
//         System.out.println("catch block");
//         System.out.println("exception occurred");
//     }
//     System.out.println("after try catch");
//     }

// public static void main(String[] args) {
//     System.out.println("before try catch");
//     try{
//         System.out.println("inside try block");
//         System.out.println(50/10);
//         System.out.println("after exception");
//     }
//     finally{
//         System.out.println("finally block");
//         System.out.println("deallocate resources");
//     }
//     System.out.println("after try catch");
//     }

public static void main(String[] args) {
    System.out.println("before try catch");
    try{
        System.out.println("inside try block");
        System.out.println(50/0);
        System.out.println("after exception");
    }
    catch(ArithmeticException e){
        System.out.println("catch block");
        System.out.println("exception occurred");
    }
    finally{
        System.out.println("finally block");
        System.out.println("deallocate resources");
    }
}

}