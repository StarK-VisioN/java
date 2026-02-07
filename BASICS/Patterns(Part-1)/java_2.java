// Q. Print INVERTED STAR Pattern  

public class java_2 {
    public static void main(String args[]) {
        int n = 4;                                              // Define the number of rows (4 rows of stars)
        for(int line=1; line<=4; line++) {                      // Outer loop controls the lines (1 to 4)
            for(int star=1; star<= n-line+1 ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 /*
 Logic -> 
        ****     → 4 stars  (n-line+1 → 4-1+1 = 4)
        ***      → 3 stars  (n-line+1 → 4-2+1 = 3)
        **       → 2 stars  (n-line+1 → 4-3+1 = 2)
        *        → 1 star   (n-line+1 → 4-4+1 = 1)
 */
