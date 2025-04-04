// Inheritance and Polymorphism : Inheritance, Method overriding, super keyword, Object class and
// overriding toString() and equals() method, Using super and final keywords, instanceof operator

// Abstract Class and Interface : Abstract method and abstract class, Interfaces, static and default
// methods.

class Parent {
    // Method to display a message
    void display() {
        System.out.println("Parent class");
    }
    
    // Constructor of the class (Constructor name should match the class name exactly)
    Parent() {
        System.out.println("Parent class constructor");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Parent class
        Parent obj1 = new Parent(); // Calls the constructor automatically
        obj1.display(); // Calls the display method
    }
}

class Grandparent {
    
}

// ===================================INTERFACES=========================================
// interface Salary{
//     void display();
//     int calc();
// }
// class Emp implements Salary {
//     String name;
//     int id;
//     int sal;
//     Emp(String n ,int i,int s){
//         name=n;
//         id=i;
//         sal=s;
//     }
//     public int calc(){
//         return sal;
//     }
//     public void display(){
//         System.out.println("Name is : "+name);
//         System.out.println("ID is: "+id);
//     }
// }

// =================================ABSTRACT CLASS==========================================

// abstract class Salary{
//     void display();
//     abstract int calc();
//     }
//     class Emp extends Salary{
//         String name;
//         int id;
//         int sal;
//         Emp(String n ,int i,int s){
//             name=n;
//             id=i;
//             sal=s;
//             }
//             public int calc(){
//                 return sal;
//                 }
//                 public void display(){
//                     System.out.println("Name is : "+name);
//                     System.out.println("ID is: "+id);
//                     }
//                     }


// public class Unit_3 {
//    public static void main(String[] args) {
//     Emp e1=new Emp("Rahul",1,10000);
//     Emp e2=new Emp("Rohit",2,20000);
//     e1.display();
//     e2.display();

//     System.out.println("Salary is : "+e1.calc());
//     }
//    }
    

// ============= interfaces Ananomus class==============================

// interface ABC {
//     void disp();
//     void calc();
// }
// public class Unit_3{
//     public static void main(String[] args) {
//         ABC o1=new ABC() {
//             public void disp(){
//                 System.out.println("hello");
//             }
//             public void calc(){
//                 System.out.println("LPU");
//             }
//         };
//         o1.disp();
//     }
// }

// =============================Ananomus class=========================================











// =============================Functional Interface==========================================
// @FunctionalInterface
// interface ABC {

//     void disp(int a);
// }
// public class Unit_3{
//     public static void main(String[] args) {
//         ABC o1=  a->{if(a%2==0) System.out.println("Even Number"); else System.out.println("Odd Number");
    
//     };
//     o1.disp(5);
// }
// }
