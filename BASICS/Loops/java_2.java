// Print numbers from 0 to 10

// public class java_2 {
//     public static void main(String args[]) {
//         int counter = 1;
//         while(counter <= 10) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }




// Q. Print numbers from 1 to n

// import java.util.*;
// public class java_2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number :");
//         int n = sc.nextInt();

//         int counter = 1;
//         while(counter <= n) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }




// Q. print sum of first n natural numbers
import java.util.*;

public class java_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n :");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i<=n) {
            sum += i;           // sum = i+sum;
            i++;
        }
        System.out.println("sum is :" + sum);
    }
}