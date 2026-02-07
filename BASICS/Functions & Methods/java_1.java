// Q. Write function to print "Hello World"
import java.util.*;

public class java_1 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2) {        // & then receving a, b as parameters.      Called -> formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        // printHelloWorld();                          // function call 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);               // passing my numbers in this function      Called  -> arguments
        System.out.println("sum is : " + sum);
    }
}