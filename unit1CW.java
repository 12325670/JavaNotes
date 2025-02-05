import java.util.*;

public class unit1CW {

    public static void main(String[] args) {

    // System.out.println("hello");

//     System.out.println("Enter value less than 10: ");
//     Scanner var1 = new Scanner(System.in);
//     int var2;
//     for(var2 = var1.nextInt();var2 >10; var2 = var1.nextInt()){
//         System.out.println("INVALID INPUT try again");
// }
// System.out.println("You entered: " + var2);

Scanner s = new Scanner(System.in);
System.out.println("Enter number of students: ");
int a = s.nextInt();

int[] marks = new int[a];
System.out.println("Enter marks of students: ");
for(int i=0;i<marks.length;i++){
    marks[i] =s.nextInt();
}
s.close();
System.out.println("Your Entered Marks are : ");
System.out.println(Arrays.toString(marks));
Arrays.sort(marks)
int len

}
}


