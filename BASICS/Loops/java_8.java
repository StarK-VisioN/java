// Q. Check if the number is Prime or not
// prime : 2, 3, 5, 7, 11....
import java.util.*;
public class java_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

// we know 2 is a prime number, so as exception ->
        if(n == 2) {
            System.out.println("prime number");
        } else {                                            // else execute this part.
            boolean isPrime = true;                         // assuming that our number is Prime.   &   here true  =  1 ..which checks for n = 1
            for(int i=2; i<n-1; i++) {
                if(n%i ==0) {
                    isPrime = false;
                }
            }
            if(isPrime == true) {                               // so if n == 1...its prime number
                System.out.println("prime number");
            } else {
                System.out.println("not prime number");
            }
        }      
   }
}