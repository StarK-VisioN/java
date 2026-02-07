// Max Subarray Sum -1 (Brute Force)

import java.util.*;
public class java_1 {

    public static void maxSubArraySum(int numbers[]) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {                               // calculating start
            int start = i;          // starts from 0th index
            for(int j=i; j<numbers.length; j++) {                           // calculating end
                int end = j;
                currentSum = 0;                                     // as we start with new array then value must be changed
                for(int k = start; k <= end; k++) {                         
                    currentSum += numbers[k];                       // currentSum = currentSum + numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubArraySum(numbers);
    }
}
