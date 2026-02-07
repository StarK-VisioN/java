// Pairs in an array 
import java.util.*;
public class java_8 {

    public static void pairs(int numbers[]) {
        int totalPairs = 0;
        // outter
        for(int i=0; i<numbers.length; i++) {
            int current = numbers[i];
            // inner
            for(int j= i+1; j<numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        } 
        System.out.println("total number of pairs: " + totalPairs);
    }

    public static void main(String args[]) {
    int numbers[] = {2, 4, 6, 8, 10};
    pairs(numbers);

    }
}


