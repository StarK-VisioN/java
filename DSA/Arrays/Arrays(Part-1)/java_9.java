// Print subarrays 
import java.util.*;
public class java_9 {

    public static void subArrays(int numbers[]) {
        int totalSubArrays = 0;

        for(int i=0; i<numbers.length; i++) {                               // calculating start
            int start = i;          // starts from 0th index
            for(int j=i; j<numbers.length; j++) {                           // calculating end
                int end = j;
                for(int k = start; k <= end; k++) {                         // print subArray
                    System.out.print(numbers[k] + " ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subArrays: " + totalSubArrays);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArrays(numbers);
    }
}
