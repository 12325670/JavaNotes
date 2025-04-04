public class Functions {

    // int area(int... d){
    //     if(d.length ==1){
    //         int a1=d[0]*d[0];
    //         return a1;
    //         }
    //         else if(d.length==2){
    //             int a2=d[0]*d[1];
    //             return a2;
    //             }
    //         else if(d.length == 3){
    //             int a3=d[0]*d[1]*d[2];
    //             return a3;
    //         }
    //         else{
    //             System.out.println("Invalid input");
    //             return 0;}
    //         }
            
            
    //         public static void main(String[] args) {
    //             Functions f=new Functions();
    //             int a=f.area(5);
    //             System.out.println("Area of square is: "+a);
    //             int b=f.area(5, 6);
    //             System.out.println("Area of rectangle is: "+b);
    //             int c=f.area(5, 6, 7);
    //             System.out.println("Area of cuboid is: "+c);
    //             int d=f.area(5, 6, 7, 8,7,8,9);
                



    //     }
    // }

    // calculate averate of numbers having no limites of paramerters : run a loop up to array d


    // static void avg (int... d){
    //     int sum =0;
    //     for (int i:d){
    //         sum +=i;
    //         }
    //         int a= sum/n.length;
    //         System.out.println("Average of numbers is: "+a);
    //     }

    //     public static void main(String[] args){
    //         avg(1,2,3,4,5,6,7,8,9);
    //         avg(12,13,14,34);
    //     }
    // }


    double avg (int... d){
        int sum =0;
        for (int i:d){
            sum +=i;
            }
            int a= sum/d.length;
           // System.out.println("Average of numbers is: "+a);
            return a;
        }

        public static void main(String[] args){
            Functions f = new Functions();
           double z= f.avg(1,2,3,4,5,6,7,8,9);
           System.out.println("Average of numbers is: "+z);
            double x=f.avg(12,13,14,34);
        }
    }


