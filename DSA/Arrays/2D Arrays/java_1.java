// Creating 2D arrays

import java.util.*;
public class java_1 {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            // System.out.print("Enter your matrix digits:\n");
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
