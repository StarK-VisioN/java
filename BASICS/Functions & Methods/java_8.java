// Q. Check if a number is Prime or not

// public class java_8{

//     public static boolean isPrime(int n) {

//         if(n ==2) {
//             return true;
//         }

//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++) {
//             if(n%i == 0) {
//                 isPrime = false;
//             }
//         }
//         return isPrime;
//     }

//     public static void main(String args[]) {
//         System.out.println(isPrime(8));
//     }
// }


// Optimized Prime number :- 
public class java_8 {

    public static boolean isPrime(int n) {

        if(n == 2){
            return true;
        }

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++) {            // for root n we have function  -> Math.sqrt(n)
            if (n%i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(12));
    }
}