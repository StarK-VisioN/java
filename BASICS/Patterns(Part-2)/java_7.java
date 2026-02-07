// Q. Solid Rhombus pattern

public class java_7 {

    public static void solid_rhombus(int n) {
        // outter
        for(int i=1; i<=n; i++) {
            // spaces - (n-i)
            for(int j=1; j<=(n-i); j++) {       // no of spaces = no. of n-i
                System.out.print(" ");
            }
            // stars - 5
            for(int j=1; j<=n; j++) {               // no. of stars = 5 = n
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        solid_rhombus(5);
    }
}