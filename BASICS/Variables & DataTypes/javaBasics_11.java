// Type Casting     -> forcefully changing the datatype

// import java.util.*;

// public class javaBasics_11 {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float a = 25.12f;
//         int b = (int) a;                        // niglet the loss of data , & coverts directly.
//         System.out.print(b);
//     }
// }


import java.util.*;

public class javaBasics_11 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        int number = ch;                        // even we can convert      Charector   ->   Number
        System.out.print(number);
    }
}