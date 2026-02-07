// Q. Convert from binary to decimal

public class java_10 {

    public static void binToDec(int n) {
        int myNum = n;
        int pow = 0;
        int decimalNum = 0;

        while(n > 0) {
            int lastDigit = n%10;
            decimalNum = decimalNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            n = n/10;
        }
        System.out.println("Binary form of " +myNum +" = " + decimalNum);
    }

    public static void main(String args[]) {
        binToDec(101);                                  // 101 is a binary number
    }
}