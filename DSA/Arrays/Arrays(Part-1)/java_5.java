// Largest number

import java.util.*;
public class java_5 {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;                // - infinity     ..storing the minimum value
        int smallest = Integer.MAX_VALUE;               // + infinity     ..storing the maximum value

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest =numbers[i];                    // updating with the largest value found
            }

            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is: " + getLargest(numbers));
    }
}