// import java.util.Scanner;
// class pytho{
//     int a,b,c;
    
//     boolean ispytho(){
//         return(a*a +b*b == c*c)||(b*b +c*c == a*a)||(a*a +c*c == b*b);
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		pytho p = new pytho();
// 		p.a=sc.nextInt();
// 		p.b=sc.nextInt();
// 		p.c=sc.nextInt();
// 		System.out.print(p.ispytho()?"yes":"no");
// 	}
// }

import java.util.Scanner;
// class IncrementalCounter{
//     int count;
//     IncrementalCounter(){
//         this.count =0;
//     }
//     void increment(){
//         this.count++;
//     }
//     int getCount(){
//         return this.count;
//     }
// }

// class CA{
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int numIncrements = scanner.nextInt();
// IncrementalCounter counter = new IncrementalCounter();
// if (numIncrements>0){
// for (int i = 0; i < numIncrements; i++) 
// {
// counter.increment();
// }
// }
//     System.out.println("Final Count: "+ (numIncrements>0?counter.getCount():0));
// }
// }

interface square_num{
    int calculate (int num);
    void display();
}
class Main implements square_num{
    int num;

    Main(int num){
    }
    public int calculate(){
        return num*num;
    }

    public void display(){
        System.out.println("Square of number is: "+num);
    }
    class CA{
    public static void main(String[] args) {
        calculate c1=new Main()
        
    }
    }
