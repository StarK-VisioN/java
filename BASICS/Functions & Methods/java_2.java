// Q. Swapping 2 values

// public class java_2 {
//     public static void main(String args[]) {
//         int a = 5;
//         int b = 10;

//         int temp =a;
//         a = b;
//         b = temp;
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }


// Using function   ->
public class java_2 {
  
    public static void swap(int a, int b) {             // formal parameter = copy of arguments.
        int temp = a;  
        a = b;         
        b = temp;       
        System.out.println("After swapping: a = " + a + ", b = " + b);          
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        swap(x, y);                                     // function call

        System.out.println("x = " + x);   // Still 5
        System.out.println("y = " + y);   // Still 10
    }
}
