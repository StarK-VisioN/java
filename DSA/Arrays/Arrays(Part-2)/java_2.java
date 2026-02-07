// Max Subarray Sum - 2 (Prefix array) 

import java.util.*;
public class java_2 {

    public static void prefixSubArraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];             // new prefix array of same length that of numbers array.

        prefix[0] = numbers[0];                             // start of both must be equal
        // calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum is: " +maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        prefixSubArraySum(numbers);
    }
}