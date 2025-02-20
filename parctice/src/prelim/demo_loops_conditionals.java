package prelim;

import java.util.Scanner;

public class demo_loops_conditionals {

    public static void main(String[] args) {

//        int age;
//        age=15;
//        
//        
//        
//        if(age>=18){
//            System.out.println("Eligible to vote for national election");
//        } else if(age >=16){
//            System.out.println("Eligible to SK election");
//        } else {
//            System.out.println("Not Eligible to election");
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
//       } else if (grade >= 2.75 && grade <= 2.00){
//           System.out.println("Average Student");
//       } else if(grade >2.00 &&  grade <=1.5){
//           System.out.println("SIP2x Student");
//       } else {
//            System.out.println("Batak");
//       }
// looping while loop
//        int i = 1;
//        
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//        Do/while Loop
//    int j = 0;
//    do {
//        System.out.println(j);
//        j++;
//    } while (j <=5);
//    for loop
//    for(int i= 1; i<=10; i++){
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
