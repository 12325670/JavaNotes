import java.util.Scanner;

public class unit1CW {

    public static void main(String[] args) {

    // System.out.println("hello");

    System.out.println("Enter value less than 10: ");
    Scanner var1 = new Scanner(System.in);
    int var2;
    for(var2 = var1.nextInt();var2 >10; var2 = var1.nextInt()){
        System.out.println("INVALID INPUT try again");
}
System.out.println("You entered: " + var2);
};
}

