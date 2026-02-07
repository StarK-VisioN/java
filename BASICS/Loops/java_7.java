// import java.util.*;

// public class java_7 {
//     public static void main(String args[]) {
//         for(int i = 1; i<=5; i++) {
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// Q. Display all numbers entered by user except multiples of 10   
import java.util.*;
public class java_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("enter number : ");
            int n = sc.nextInt();
            if(n % 10 ==0) {
                continue;
            }
            System.out.println("number was : " + n);
        } while(true);
    }
}