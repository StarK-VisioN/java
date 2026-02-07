// Check if a student will Pass or fail
import java.util.*;

public class java_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String what = (marks>=33) ? "pass":"fail";
        System.out.println(what);
    }
}