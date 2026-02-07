// Q. Hollow rhombus pattern

public class java_8 {

    public static void hollow_rhombus(int n) {
        // outer
        for(int i=1; i<=n; i++) {
            // spaces - (n-i)
            for(int j=1; j<=(n-i); j++) {               // as first we are printing all the spaces 
                System.out.print(" ");
            }
            // stars - borundary stars
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {          // by default these stars will be tilted
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rhombus(5);
    }
}