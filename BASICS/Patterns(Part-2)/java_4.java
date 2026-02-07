//  Q. Floyd's triangle pattern  

public class java_4 {

    public static void floyds_triangle(int n) {
        int counter = 1;
        // outer
        for(int i=1; i<=n; i++) {                           // no. of lines
            // inner - how many times will counter be printed
            for(int j=1; j<=i; j++) {                       // no of count = no. of lines
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floyds_triangle(5);
    }
}