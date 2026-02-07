// Rule 2] If 1 operand is         long, float, or double          ->      whole expression        ->      long, float, or double

import java.util.*;
public class javaBasics_13 {
    public static void main(String args[]){
        int a = 5;
        float b = 20.25f;
        long c = 25;
        double d = 30;

        double ans = a + b + c + d;                    // as 30 is the highest value so    -> ans will be "double"
        System.out.println(ans);
    }
}