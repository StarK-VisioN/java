// Spiral matrix

import java.util.*;
public class java_3 {
    public static void printSprial(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            // top
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for(int j=endCol-1; j>=startCol; j--) {
                // special condition - if rows are less and cols are more then after completion of rows our loop will stop
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for(int i=endRow-1; i>=startRow+1; i--) {
                // special condition - if rows are more and cols are less then after completion of cols our loop will stop
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // update for next inner iteration
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 20, 11, 12},
                          {13, 14, 15, 16}};
        printSprial(matrix);
    }
}