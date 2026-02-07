// print the largest of 3 number

import java.util.*;

public class java_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 6, b = 3, c = 1;

        if(a>=b && a>=c) {
            System.out.println("A is grestest");
        }
        else if(b >= c) {
            System.out.println("B is the greatest");
        }
        else {
            System.out.println("C is the greatest");
        }
    }
}