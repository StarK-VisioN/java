import java.util.*;
public class java_6 {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // original array - tracking number of ele's (count)
        int count[] = new int[largest + 1];     // if largest = 7  then count must be 8 including 0th index
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;        // if arr[i] = 1 which comes 3 times then count++ count++ count++  (3 times for same arr[i])
        }

        // sorting - on frequency array
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;             // because single element can have more than 1 frequency
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}