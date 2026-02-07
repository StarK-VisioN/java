// Q. Print all primes in a range   n=10
public class java_9 {

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

    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        primeInRange(20);
    }
}