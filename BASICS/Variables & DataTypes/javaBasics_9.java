// Area of Circle

import java.util.*;

public class javaBasics_9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();                // can use 'double' dataType
        float area = 3.14f * radius * radius;           // if we use float then we need to give     'f' at the end of the digit
        System.out.print(area);
    }
}