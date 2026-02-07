import java.util.*;
public class java_3 {
    public static void insertionSort(int arr[]) {
        // we want to place minimum 4 elements out of 5 ele. on there right position
        for(int i=1; i<arr.length; i++) {       // will start from 2nd index of array i.e. i=1
            int current = arr[i];
            int prev = i-1;
            // Find correct position to insert `current` and shift elements
            while(prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];     // shift larger element one position right
                prev--;
            }
            // Insert `current` at its correct position
            arr[prev + 1] = current;
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] ={5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}