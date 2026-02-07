// Q. Print CHARECTOR pattern 
public class java_4 {
    public static void main(String args[]) {
        char n = 4;                                         // first only define no. of rows.
        char ch = 'A';

        for(int line = 1; line<=n; line++) {                // how many rows...i.e.lines
            for(int chars=1; chars<=line; chars++){         
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}