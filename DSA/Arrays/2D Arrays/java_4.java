// Diagonal sum

import java.util.*;
public class java_4 {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(i==j) {
        //             sum += matrix[i][j];
        //         }
        //         else if (i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // more optimised :- 
        for (int i=0; i<matrix.length; i++) {
            // PD 
            sum += matrix[i][i];        // (1,1) (2,2) (3,3) (4,4)
            // SD
            if (i != matrix.length-1-i) {   // condition where i != j  ... j = n-1-i  ...  as i+j = n-1
                sum += matrix[i][matrix.length-i-1];   // matrix[i][j]
            }
        }
        return sum; 
    }

    public static void main(String args[]) {
        int matrix[][] = {
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}
                         };
        System.out.println("Diagonal sum: " + diagonalSum(matrix));
    }
}