/* 

Class :- 
        It is a place where we write whole code.
        Like your classroom where all students sit together.
        And the name of the file & class must be same.

        i.e.  public class javaBasics {  }                  javaBasics  -> is the name of the class.


        Inside this we define a "Main" function ->
            public static void main(String args[]) {  }


So the BoilerPlate of Java  ->

        public class javaBasics{
                public static void main(String args[]){
                        // Java code
                
                }
        }


There are 3 methods to print Output in Java :- 
        1. print("");
                                e.g. :- System.out.print("Hello");

        2. println("");
                                e.g. :- System.out.println("Hello");

        3. "\n"
                                e.g. :- System.out.print("Hello\n");



Print Pattern :-                                                                 javaBasics_2.java
        ****
        ***
        **
        *


Variables in java :-                                                            javaBasics_3.java
        
        a = 10, b= 5                    2*(a+b)

        here,           a,b  are the variables
                        2    is the literals

                        Literals are those which are universal, whose values are same accross the world. 

        Use -> 
                public class javaBasics_3 {
                    public static void main(String args[]){
                        int a = 10;
                        int b = 5;
                        System.out.println(a);
                        System.out.println(b);
                        String name = "Tony Stark";
                        System.out.println(name);

                        a = 50;                                      ->  even if later we want to change the value of 'a'
                        System.out.println(a);
                        }
                }


Data Types in Java :-                                                           javaBasics_4.java

        1. Primitive (which exists) :-                                  2. Non Primitive (which we need to create) :-  
                                byte                                                                    String
                                short                                                                   Array
                                char                                                                    Class
                                boolean                                                                 Object
                                int                                                                     Interface
                                long
                                float
                                double

        e.g. :- javaBasics_4.java
NOTE :- range for       byte    [-128 to 127]



Sum of a & b :-                                                                 javaBasics_5.java
        


Input in Java :-                                                                javaBasics_6.java
          
        1. .next()             :- to store single word
        2. .nextLine()         :- to store multiple words or paragraph
        3. .nextInt()          :- for number input
        4. .nextFloat()         :- for floating values input
        5. .nextByte()          : -for byte numbers
        6. .nextFloat()
        7. .nextDouble()
        8. .nextBoolean()
        9. .nextShort()
        10. .nextLong()


                import java.util.*;                                    
                public class javaBasics_6 {
                    public static void main(String args[]) {
                        Scanner sc = new Scanner(System.in);            // Scanner is the class, which is present in package -> util 
                        String input = sc.next();                       // .next()  -> used to capture the input & store in 'sc' object
                        System.out.println(input);                      // printen the result

                        String name = sc.nextLine();
                        System.out.println(name);

                        int number = sc.nextInt();
                        System.out.println(number);

                        float price = sc.nextFloat();                          // floating values input
                        System.out.println(price);
                    }
                }  
        

        Sum of a + b  :-                                                        javaBasics_7.java

                import java.util.*;
                public class javaBasics_7 {
                        public static void main(String args[]) {
                                Scanner sc =new Scanner(System.in);
                                int a = sc.nextInt();
                                int b = sc.nextInt();
                                int sum = a + b;
                                System.out.print(sum);
                        }
                }


        Product of a & b   :-                                                   javaBasics_8.java
        
                import java.util.*;
                public class javaBasics_8 {
                        public static void main(String args[]) {
                                Scanner sc = new Scanner(System.in);
                                int a = sc.nextInt();
                                int b = sc.nextInt();
                                int product = a * b;
                                System.out.print(product);
                        }
                }


        Area of Circle  :-                                                      javaBasics_9.java



Type Conversion :-                                                              javaBasics_10.java
                Also called "Lossy" conversion.

                Conversion happens when:                                        
                1. type compatible
                2. destination type > source type

                byte -> short -> int -> float -> long -> double

e.g. :- 
        import java.util.*;
        public class javaBasics_10 {
                public static void main (String args[]) {
                        Scanner sc = new Scanner(System.in);
                        float number = sc.nextInt();                // conversion from Int -> float     Possible           destination > scource
                        System.out.print(number);
                }
        }



Type Casting :-                                                                 javaBasics_11.java
                Forcefully making any DataType to change.
                See we know we can convert Long -> int    or   float -> int   ,   but by Type Casting this is possible.
                This will lead to "DATA LOASS". Niglet the loss of data , & coverts directly.

                        float a = 25.12f;
                        int b = (int) a;

        e.g. :-
                import java.util.*;
                public class javaBasics_11 {
                        public static void main (String args[]) {
                                Scanner sc = new Scanner(System.in);
                                float a = 25.12f;
                                int b = (int) a;                        // niglet the loss of data , & coverts directly.
                                System.out.print(b);
                        }
                }

        Also we can convert ch -> number
        
                import java.util.*;
                public class javaBasics_11 {
                        public static void main (String args[]) {
                                Scanner sc = new Scanner(System.in);
                                char ch = 'a';
                                int number = ch;                        // even we can convert      Charector   ->   Number
                                System.out.print(number);
                        }
                }




Type Promotion in Expression :- 
        Rule 1]         Java automatically converts     byte, short, char       ->      int
                e.g. :-   javaBasics_12.java


        Rule 2]         If 1 operand is         long, float, or double          ->      whole expression        ->      long, float, or double
                e.g. :-   javaBasics_13.java



How is our Code Running?
        JDK (Java Development Kit) consist of Development tools. Inside which we have "Modules" i.e. JRE (Java Runtime Environment) consists of 
        Virtual Machines + Libraries.

        Source code     ->    compilor    ->     Byte code      ->     JVM     ->      Native code
          (.java)                                 (.class)

        So there are 2 steps:-
                1. Compilation
                2. Execution



Practice Q.  Q.1 - Q.5                                                          javaBasics_14.java







*/