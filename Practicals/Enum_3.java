import java.util.Scanner;
public class Enum_3 {
    
// create a enum of traffic lights if user enter red print stop and so on.....
enum light{RED,YELLOW,GREEN}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String i=sc.next().toUpperCase();
    light j =light.valueOf(i);
    System.out.println("Enter the traffic light color");
    switch(j){
        case RED :
        System.out.println("stop");
        break;
        case YELLOW:
        System.out.println("go slow");
        break;
        case GREEN:
        System.out.println("go");
        break;
        default:
        System.out.println("invalid input");
        }
        }
}
