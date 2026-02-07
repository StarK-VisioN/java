/*

** Operators 


Types of Operators :- 
            Symbols that tell compiler to perform some operation.
                e.g.    sum = a + b;            here,    a , b  ->  operands            +   is the operator.
            

Types of Operators :- 
        1. Arithmetic Operators (Binary/ Unary)
        2. Relational Operators
        3. Logical Operators
        4. Bitwise Operators
        5. Assignment Operators 7


1. Arithmetic Operator :- 
            1. Binary :- Which has 2 operands                                                   java_1.java
                    +    -   *   /   %
                e.g. 
                        public class java_1 {
                            public static void main(String args[]) {
                                int A = 10;
                                int B = 5;
                                System.out.println("Sum = " + (A+B));
                                System.out.println("subtract = " + (A-B));
                                System.out.println("multiply = " + (A*B));
                                System.out.println("divide = " + (A/B));
                                System.out.println("modulo = " + (A%B));
                            }
                        }


            2. Unary :-  Which has 1 operand                                                    java_2.java
                    ++      --
                
                    Pre Increment ->
                        ++a             here, 1. value change
                                              2. value use

                    Post Increment  ->
                        a++             here, 1. value use (old value) 
                                              2. change value



2. Relational Operators :- 
            ==      !=      >       <       >=      <=                                          java_3.java

            e.g. :- 
                    public class java_3 {
                    public static void main(String args[]) {
                        int A = 10;
                        int B = 5;
                        System.out.println((A==B));
                    }
                }



3. Logical Operators :-
            To check program logic.

            &&      (Logical AND)
                                            T   T   =   T
                                            T   F   =   F
                                            F   T   =   F
                                            F   F   =   F

                    e.g. :- 
                            System.out.println( (3>2) && (5>0) );       -> this will return True                
                                   

                            
            ||      (Logical OR)
                                            T   T   =   T
                                            T   F   =   T
                                            F   T   =   T
                                            F   F   =   F

                    e.g. :- 
                            System.out.println( (3>2) || (5>0) );       -> this will return True 



            !       (Logical NOT)                                           Reverse of each other.
                                            T   =   F
                                            F   =   T                   

                    e.g. :- 
                            System.out.println( !(3>2) );               -> return Flase.



4. Assignment Operator :- 
            =               to change the value of operand.
                    e.g. :-  A = B

            +=              
                    e.g. :-   A = A + 10
                        Can be writen as        A += 10

            -=
                    e.g. :-    B = B - 10
                                                B -= 10

            *=
            /=
















*/