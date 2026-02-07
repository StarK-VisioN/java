// Q.print hello world 10 times 

// public class java_3 {
//     public static void main(String args[]) {
//         int n = 10;
//         for(int i = 0; i<n; i++) {
//             System.out.println("Hello world");
//         }
//     }
// }



// Q. Print SQUARE pattern
// public class java_3 {
//     public static void main(String args[]) {
//         for(int line = 1; line <=4; line++) {
//             System.out.println("* * * *");
//         }
//     }
// }



// Q. print reverse of a number  (flip the number)
/*
concept :- 
                                1. to get lastDigit     
                                                lastDigit = n % 10;

                                2. to remove lastDigit
                                                lastDigit = n / 10;

*/
// public class java_3 {
//     public static void main(String args[]) {
//         int n =10899;

//         while( n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + " ");

//             n = n / 10;
//         }
//     }
// }





// Q. Reverse the given number
public class java_3 {
    public static void main(String args[]) {
        int n = 10899;
        int reverse = 0;

        while(n > 0) {
            int lastDigit = n%10;                           // taking out lastDigit from the number n
            reverse = (reverse * 10) + lastDigit;           
            n = n/10;                                       // this is updation of the number
        }
        System.out.println("reverse number is :" + reverse);
    }
}


