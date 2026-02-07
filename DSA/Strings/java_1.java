// Syntax for creating strings

import java.util.*;
public class java_1 {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};      // use single quotes only!!!
        String str = "abcd";
        String str2 = new String ("abcd");

        // Strings are IMMUTABLE (cant change).

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);      
    }
}