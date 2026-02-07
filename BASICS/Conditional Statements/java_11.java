// Practice Q.
// 1. Write a Java program to get a number from the user & print whether it is +ve or negative.
// import java.util.*;
// public class java_11 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number :");
//         int number = sc.nextInt();

//         if(number >= 0) {
//             System.out.println("number is +ve");
//         } else {
//             System.out.println("number is -ve");
//         }
//     }
// }




// 2.if temperature > 100    ..you have fever       otherwise you dont have fever.
// public class java_11 {
//     public static void main(String args[]) {
//         double temp = 103.5;

//         if (temp > 100) {
//             System.out.println("you have fever");
//         } else {
//             System.out.println("you dont have fever");
//         }
//     }
// }




// 3. Wrtie program to input week number (1-7) & print day of week name using switch case.
// import java.util.*;
// public class java_11 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter week number(1-7)");
//         int weekNumber = sc.nextInt();
//         switch(weekNumber) {
//             case 1 : System.out.println("1-monday");
//                         break;
//             case 2 : System.out.println("2-tuesday");
//                         break;
//             case 3 : System.out.println("3-wednesday");
//                         break;
//             case 4 : System.out.println("4-thrusday");
//                         break;
//             case 5 : System.out.println("5-friday");
//                         break;
//             case 6 : System.out.println("6-saturday");
//                         break;
//             case 7 : System.out.println("7-sunday");
//                         break;
//             default : System.out.println("Wrong input");    
//         }
//     }
// }




// 4. solution
// 5. program that takes a year from user & print whether that year is a leap yer or not.
// import java.util.*;
// public class java_11 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter Year :");
//         int year = sc.nextInt();

//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = ((year % 100 == 0) && (year % 400 == 0));

//         if(x && (y || z)){
//             System.out.println("leap year");
//         } else {
//             System.out.println("not a leap year");
//         }
//     }
// }


