// Max Subarray Sum - 3 (Kadane's Algorithm)

import java.util.*;
public class java_3 {

    public static void kadanes(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if(currentSum < 0) {                                // as we dont need any sort of -ve numbers, If found then assign 0
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Our maximum subarray sum is: "+ maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        kadanes(numbers);
    }
}




// Kadanes on all -ve array 
// import java.util.*;
// public class java_3 {
//     public static void kadanes(int numbers[]) {
//         int currentSum = numbers[0];
//         int maxSum = numbers[0];

//         for(int i=1; i<numbers.length; i++) {
//             currentSum = currentSum + numbers[i];
//             // if(currentSum < 0) {
//             //     currentSum = 0;
//             // }
//             maxSum = Math.max(currentSum, maxSum);
//         }
//         System.out.println("max subarray sum is: " +maxSum);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {-1, -2, -3, -4};
//         kadanes(numbers);
//     }
// }