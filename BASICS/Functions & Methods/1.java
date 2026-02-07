/*

Functions & Methods :- 

    Introduction to Functions :- 
        1. What is function?
            It is a block of code that perform some task. By making the call we can use this any time we want.(Re-Usable)

        Syntax :- 
            returnType name() {
                // body
                return statement;
            }

        e.g. :- The most common used function, we used till now was     main() ->
                    public class java_1 {
                        public static void main(String args[]);                     // main         -> name of the function
                    }                                                                  void         -> returnType
                                                                                    (String args[]) -> input 

NOTE :-   void  is used when the function do not return anything

    Q. Write function to print "Hello World"                                             java_1.java



Syntax with Parameters :- 

    returnType name(type param1, type param2) {                 // param1, param2    -> inputs that we are going to use inside function.                   
        //body
        return statement;
    }

    e.g. :- print sum of a,b                                                             java_1.java


IMP :- 
    There are 2 types :- 
            1. formal parameters                                2. actual parameters
                (parameters)                                          (arguments)

        Comes, function definition                              Comes, function Call



What happens in Memory when we Write the function (i.e. function definition) & when we call the function (i.e. function call)?

        Function Call: When the function is called, the call stack handles the execution by:
                        1. Pushing the function and its variables onto the stack.
                        2. Executing the function with the passed arguments.
                        3. Popping the function from the stack once it returns the value.

    For proper explanation Check NoteBook ..Java


Call by Value :- 
        In Java, when we define variable inside main() and pass them to new function()...they pass variables as a copy.

    Q. writing code for Swapping 2 values                                       java_2.java


Q. Find product of a & b                                                        java_3.java

Q. Factorial of a number, n=4                                                   java_4.java

Q. Binomial Coefficient                                                         java_5.java



Inbuilt vs User defined functions 

        1. user defined functions :-
                Functions that are defined by user. We define those functions.

                e.g. :-     Factorial, sum, product

        2. inbuilt functions :-
                Functions that are inbuilt. We dont need to define them.

                e.g. :-     math(), pow(), min(), max(), nextInt()


                
Function Overloading :- 
        Multiple functions having same name but different parameters.

        e.g. :-     multiply(int a, int b);

                    multiply2(float a, float b);

                    multiply3(double a, double b);

                    multiply4(int a, int b, int c);

        So to solve this issue Java provides us that all the function names will be same just will give different parameters.

    
    
Function Overloading using Parameters :-                                                    java_6.java

Function Overloading using Data Types :-                                                    java_7.java

Q. Check if a number is Prime or not                                                        java_8.java

Q. Print all primes in range                                                                java_9.java

Q. Convert from binary to decimal                                                           java_10.java

Q. Convert from decimal to binary                                                           java_11.java



Scope :- 
    Deifining a variable inside any function can only be accessible itself within the function.

    1] Method scope :- 
        e.g. :- 
            public static void printS() {
                int s = 45;
            }
            public static void main(String args[]) {
                System.out.println(s);                 -> here, will get the error because the scope of 'S' is not valid till another function main.
            }

    2] Block scope :- 
        e.g. :- 
            public static void printS() {
                {
                    int s = 45;
                }
                System.out.println(s);              -> here, outside the block we cant access this 'S'
            }



Practice Q.                                                                                 java_12.java











*/