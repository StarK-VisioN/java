// Rule 1]  Type promotion  i.e.  Byte, short, char     ->     int  (automatically).

import java.util.*;

public class javaBasics_12{
    public static void main(String args[]){
        char a = 'a';                           // value of a = 97
        char b = 'b';                           // value of b = 98
        System.out.println((int)a)
        System.out.println(b-a);                // so this conversion will be dn Automatically by java
    }
}