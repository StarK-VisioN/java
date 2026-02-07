// if-else
import java.util.*;

public class java_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is:" + (age));

        if(age >= 18) {
            System.out.println("adult: can drive, vote");
        }

        if(age>13 && age<18) {
            System.out.println("teenagers");
        }

        else {
            System.out.println("not adult");
        }
    }
}