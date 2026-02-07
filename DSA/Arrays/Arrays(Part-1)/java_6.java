// Binary Search 

import java.util.*;

public class java_6 {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;
        
            if(numbers[mid] == key) {     // found
                return mid;
            }   
            if(numbers[mid] < key) {      // right side
                start= mid+1;       
            } else {                    // left side
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key =10;
        System.out.println("index of key is: " +binarySearch(numbers, key));
    }
}