package prelim;

import java.util.Scanner;



public class demo_loops_conditionals {

    public static void main(String[] args) {

//        int age = 15;
//
//        if (age >= 16) {
//            if(age >=18 && age <=30) {
//                System.out.println("Eligible to vote for  both SK and National election only");
//            } else if (age >=16 && age <=30){
//                System.out.println("Eligible to vote SK election");
//            } else if (age >=18 && age >30){
//             System.out.println("Eligible to vote for  National election only");
//            } else if(age >=18 && age <=30) {
//                System.out.println("Eligible to vote for  both SK and National election only");
//            }
//        } else {
//            System.out.println("Not Eligible to vote election");
//        }

//        double grade;
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter your Grade: ");
//        grade = in.nextDouble();
//       if (grade == 5.0){
//           System.out.println("BOGO Ka!");
//       } else if (grade == 3.0){
//           System.out.println("Gipahangyo!");
//       } else if (grade > 2.00 && grade <= 2.75){
//           System.out.println("Average Student");
//       } else if(grade >=1.5 &&  grade <=2.00){
//           System.out.println("SIP2x Student");
//       } else {
//            System.out.println("Batak");
//       }
//       
       
 
// looping while loop
//        int i = 2;
//        
//        while(i<=10){
//            System.out.println(i);
//            i = i + 2;
//        }
        
    
//        Do/while Loop
//    int j = 3;
//    do {
//        System.out.println(j);
//        j = j + 3;
//    } while (j<=30);






//    for loop
//    for(int i= 10; i>0; i--){
//        System.out.println(i);
//    }




//    Nested Loop 
        for (int x = 1; x<=10; x++){
            for(int y=1; y <=10; y++){
                System.out.printf("%4d" ,  x*y);
            }
            System.out.println();
        }
    }

}
