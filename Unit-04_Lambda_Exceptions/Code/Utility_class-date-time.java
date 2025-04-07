// Nested Class and Lambda Expressions: : Nested Class, Understanding the importance of static
// and non-static nested classes, Local and Anonymous class, Functional Interface, Lambda expressions
// Utility Classes : Working with Dates
// Exceptions and Assertions : Exception overview, Exception class hierarchy and exception types,
// Propagation of exceptions, Using try, catch and finally for exception handling, Usage of throw and
// throws, handling multiple exceptions using multi-catch, Autoclose resources with try-with resources
// statement, Creating custom exceptions, Testing invariants by using assertions

// ---------------------Ye Din ye Mahine saal ---------------------
// #######################################Utility Classes : Working with Dates#####################################
// legacy classes date and calender
// modern and core classes : LocalDate, LocalTime, LocalDateTime, Period, Duration, Instant,ZonedDateTime
// =================================== local date local time local date time===============================
import java.time.*; 
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class unit_4 {
    public static void main(String[] args) {
        // LocalDate d1 = LocalDate.now();
        // System.out.println(d1);
        // LocalDate d2 = LocalDate.of(2022, 14, 25);
        // System.out.println(d2);

// --------------------------------------EXCEPTIONAL HANDLING-----------------------------------------------

    //     try {
    //         LocalDate d2 = LocalDate.of(2022, 12, 25);
    //         System.out.println(d2);
    //         System.out.println("try block executed");
    //     } catch (Exception e) {
    //         System.out.println("Catch block executed");
    //     }
    //     System.out.println("hii");
    //     System.out.println("hello");
    // }

    // [error and exception error cant compile  while exception occurs after compilation ,
    //  in case of error programm doesnot compile,
    //  but in case of exception the programme compiles and executes till the point where the exception has occurred
    // it stops the programme execution and throws an error
    // it entrupts the normal flow of code ]

    
// get -> is used to retrive value 
// with -> is used to replace value
// plus -> is used to add value
// minus -> is used to subtract value
// // set -> is used to replace value
// // ifAbsent -> is used to replace value if absent
// // ifPresent -> is used to execute a function if present

        // Month =d1.getMonth();


        // LocalTime t1 = LocalTime.now();
        // System.out.println(t1);
        // LocalTime t2 = LocalTime.of(12, 30, 45);
        // System.out.println(t2);
        // LocalTime t5 = LocalTime.of(12,30);
        // System.out.println(t5);
        // // LocalTime t3 = LocalTime.of(12);
        // // System.out.println(t3);
        // LocalTime t4 = LocalTime.of(12,30,45,100);
        // System.out.println(t4);

        // LocalDate dA= new Date();
        // System.out.println(dA);

        LocalDate DOB1 = LocalDate.of(2004,9,15);
        System.out.println(DOB1);

        LocalDate Today = LocalDate.now();
        System.out.println(Today);
        // yeardob = DOB1.getYear();
        // monthdob = DOB1.getMonthValue();
        // daydob = DOB1.getDayOfMonth();

        // yearnow =Today.getYear();
        // monthnow =Today.getMonthValue();
        // daynow =Today.getDayOfMonth();

        // LocalDate d3 = DOB1.plusYears(1); 
        // System.out.println("Day on your First Birthday : "+(d3.getDayOfWeek()));


        // System.out.println("date when you were 6 month old: "+(DOB1.plusMonths(6)));

        // LocalDate d4 = DOB1.plusDays(120);
        // System.out.println("which month of the year was going on when you spend 120 days on this earth is : "+ (d4.getMonth()));


        // Period d5 = Period.between(DOB1, Today);
        // System.out.println("your age is  "+d5.getYears()+" years old");
        // LocalDate d7 = LocalDate.of(2007, 1, 1);
        // Period d6 = Period.between(DOB1, d7);

        // System.out.println("your first date of school was 1 jan 2007 how old you were when you were at school : "+d6.getYears());

        // ======================Date time formater=============================

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.YY");
        String d = dtf1.format(Today);
        System.out.println(d); 

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("DD.MM.YY");
        String d2 = dtf2.format(Today);
        System.out.println(d2);

        // DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd.mm.YY");
        // String d3 = dtf3.format(Today);
        // System.out.println(d3);

        // DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd.MM.yy");
        // String d4 = dtf4.format(Today);
        // System.out.println(d4);
     
        System.out.println(Today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println(Today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));


    }
}
