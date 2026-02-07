// Q. 0-1 triangle

public class java_5 {

    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {           // no of times = no. of rows
                if((i+j) % 2 == 0) {            // even condition 
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        zero_one_triangle(5);
    }
}