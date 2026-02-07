/*

Conditional Statements :- 

    1. if-else                                                                              java_1.java

            Syntax :-
                        if(condition) {
                            //
                        } else {
                        
                        }

            e.g. :- 
                    import java.util.*;
                    public class java_1 {
                        public static void main(String args[]) {
                            Scanner sc = new Scanner(System.in);
                            int age = sc.nextInt();
                            System.out.println("Your age is:" + (age));

                            if(age >= 18) {                                                     here all "if" will b checked 
                                System.out.println("adult: can drive, vote");
                            }

                            if(age>13 && age<18) {                                              14-17
                                System.out.println("teenagers");
                            }

                            else {                                                              0-13
                                System.out.println("not adult");
                            }
                        }
                    }

            Q. Print the largest of 2 numbers               A = 1, B = 3                    java_2.java

            Q. Print if a number is Odd or Even                                             java_3.java



    2. else if                                                                              java_4.java

            Syntax :- 
                        if(condition 1) {
                            //
                        }
                        else if(condition 2) {
                            //
                        } 
                        else {
                            //
                        }

            e.g. :- 
                    import java.util.*;
                    public class java_1 {
                        public static void main(String args[]) {
                            Scanner sc = new Scanner(System.in);
                            int age = sc.nextInt();
                            System.out.println("Your age is:" + (age));

                            if(age >= 18) {
                                System.out.println("adult: can drive, vote");
                            }

                            else if(age>13 && age<18) {
                                System.out.println("teenagers");
                            }

                            else {
                                System.out.println("not adult");
                            }
                        }
                    }

        Q. Income Tax Calculator                                                                java_5.java
            Conditions :-       income < 5L             0% tax
                                income between 5-10L    20% tax
                                income > 10L            30% tax 

        Q. Print the largest of 3 numbers                                                       java_6.java



    3. ternary operator :-                                                                      java_7.java
                        variable = condition? statement_1 : statement_2;

                        e.g. :- 
                                int larger = (5>3)? 5:3;

                                String type = (5%2 == 0)? "even":"odd";

        Q. Check if a student will Pass or fail         marks >= 33: pass                       java_8.java  
                                                        marks<33: fail 



    4. switch :-                                                                                java_9.java
            Syntax :- 
                    switch(variable) {
                    case 1:

                    case 2:

                    case 3:

                    default:
                    }

            Q. Calculator                                                                       java_10.java


Practice Q.                                                                                     java_11.java






































 */