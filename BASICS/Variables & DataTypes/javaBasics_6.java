// Input in java 
import java.util.*;                                     // util Package

public class javaBasics_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);            // Scanner is the class, which is present in package -> util 
        // String input = sc.next();                       // .next()  can store only 1 word.
        // System.out.println(input);                      // printen the result

        // String name = sc.nextLine();                        // to store white spaces with other words, can store multiple words.
        // System.out.println(name);

        int number = sc.nextInt();                          // number input
        System.out.println(number);

        float price = sc.nextFloat();                          // floating values input
        System.out.println(price);
    }
}