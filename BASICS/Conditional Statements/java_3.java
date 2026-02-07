// Q. Print if a number is Odd or Even  

import java.util.*;

public class java_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input number is:" + (n));

        if (n%2 == 0 ) {
            System.out.println((n) + " is even");
        } else {
            System.out.println((n) + (" is odd"));
        }
    }
}