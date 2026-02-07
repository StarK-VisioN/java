// Q. Inverted & half Pyramid

public class java_2 {

    public static void inverted_roted_half_pyramid(int n) {
        // no of lines(rows)
        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=n-i; j++) {             // space for 1st row    =   4-1 = 3
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=i; j++) {               // no. of star = no. of row        "1 star for 1st row" , "2 stars for 2nd row"
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_roted_half_pyramid(4);
    }
}