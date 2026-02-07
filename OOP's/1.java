/*

OOP's :- 

1. classes and objects                      Java_1.java

2. Access modifiers                         Java_2.java

        | Modifier    | Same Class | Same Package | Subclass (other package) | Other Packages |
        | ----------- | ---------- | ------------ | ------------------------ | -------------- |
        | `public`    | ✅         | ✅          | ✅                       | ✅            |
        | `protected` | ✅         | ✅          | ✅                       | ❌            |
        | *default*   | ✅         | ✅          | ❌                       | ❌            |
        | `private`   | ✅         | ❌          | ❌                       | ❌            |
 

3. Getter & Setter                                                                      Java_3.java
    get :-  to return the value         getter
    set :-  to modify the value         setter

    this :-  this keyword is used to refer to the current object.

Getters and Setters are used to access and update private fields of a class in a controlled way.



4. Encapsulation :-                                                                     Java_4.java
            Defined as the wrapping up of data & methods under a single unit. It also implements data hiding.
            Wrapping data & methods in a single entity (i.e. class) called encapsulation.




5. Constructors :-                                                                      Java_5.java
            Constructors is a special method which is invoked automatically at the time of object creation.
            Constructors dont have a return type.(not even void).
            Constructors are only called once, at object creation.
            Memory allocation happens when constructor is called. 



Types of constructors :- 
    1] non-parameterised :-                                                             Java_6.java
                dont pass any parameters

    2] parameterised :-                                                                 Java_6.java
                have parameters         

    3] copy constructor :-                                                              Java_7.java



6. Shallow & deep copy

Shallow copy :-                                                                         Java_8.java
        A shallow copy copies the object and references to the inner objects, not the actual inner objects.
        So if you change the inner object (like an array), it will affect both copies.

Deep copy :-                                                                            Java_9.java
        A deep copy copies the object and creates a copy of all inner objects too.
        So changes in one object won't affect the other.



7. Destructor :- 
        In Java, there is no destructor like in C++.
        Instead, Java uses Garbage Collection (GC) to automatically free up memory by destroying unused objects.
        When there are no references to an object, Java automatically deletes it.
        This cleanup is done by the Garbage Collector.
        You cannot predict exactly when the GC will run.



8. Inheritance :-                                                                       Java_10.java
        When properties & methods of base class are passed on to a derived class.

                    parent class   ->   Child class/derived class


Types of Inheritance :- 
        1] Single level inheritance                                                     Java_10.java
                                When a class inherits from one superclass only.

        2] Multi level inheritance                                                      Java_11.java
                                When a class is derived from a class which is already derived from another class.

        3] Hierarchial level inheritance                                                Java_12.java
                                When multiple classes inherit from a single parent class.

        4] Hybrid level inheritance                                                     Java_13.java
                                combination of two or more types of inheritance (e.g., hierarchical + multilevel). Since Java doesn’t support multiple inheritance with classes, hybrid inheritance is usually implemented using interfaces + classes.



9. Polymorphism :- 
        Polymorphism means "many forms". In Java, polymorphism allows one interface to be used for a general class of actions. It helps achieve flexibility and reusability in code.

-Types :- 
        1] Compile time polymorphism :-                                                 Java_14.java
                also known as Static Polymorphism
                Achieved using method overloading.
                Decision is made at compile time which method to call based on parameters.

        2] Run time polymorphism :-                                                     Java_15.java
                also known as Dynamic Polymorphism
                Achieved using method overriding.
                Decision is made at runtime which method to call based on the object.


10. Packages in Java :- 
        Package is a group of similar types of classes, interfaces and sub-packages.

-Type of Packages :- 
        1] In-built packages
                        These are the packages that come with the Java Development Kit (JDK). Java provides many built-in packages for different functionalities.
                 Examples of Built-in Packages:
                        Package Name	Purpose
                        java.lang	Fundamental classes (String, Math, etc.)
                        java.util	Utility classes (collections, date, etc.)
                        java.io	Input and output operations (File, Stream)
                        java.net	Networking classes (Socket, URL, etc.)
                        java.sql	Database interaction (JDBC classes)
        
                e.g. :- 
                        import java.util.Scanner;

                        public class Demo {
                            public static void main(String[] args) {
                                Scanner sc = new Scanner(System.in);  // java.util package
                                System.out.print("Enter name: ");
                                String name = sc.nextLine();
                                System.out.println("Hello " + name);
                            }
                        }


        2] User-defined packages
                        These are packages created by users to logically group their own classes and interfaces.
                e.g. :- 
                        Step 1: Create the package and class
                                        // File: mypackage/Animal.java
                                        package mypackage;

                                        public class Animal {
                                            public void display() {
                                                System.out.println("This is an Animal class.");
                                            }
                                        }

                        Step 2: Use the package in another class
                                        // File: Test.java
                                        import mypackage.Animal;

                                        public class Test {
                                            public static void main(String[] args) {
                                                Animal a = new Animal();
                                                a.display();
                                            }
                                        }




11. Abstraction :-                                                                      Java_16.java
        Hiding all the unnecessary details and showing only the important parts to the user.         
        In acutal here we give an idea for next sub-classes, but the implementation.
        e.g. :- 
                When you drive a car, you use the steering wheel, accelerator, and brake.
                You don’t need to know how the engine works internally — that’s abstraction.

        1] Abstract Class :- 
                        An abstract class is a class that cannot be instantiated (you can't create objects of it). It can have:
                        1. Abstract methods (without a body)
                        2. Concrete methods (with a body)
                        3. Constructors, fields, and static methods 


        2] Interface :-                                                                  Java_17.java                               
                        Interface is a blueprint of a class
                        & class is a blueprint of object.

                        e.g. :- 
                                Car having (wheels, speed, engine)              = interface
                                Maruti 800                                      = class
                                car1 car2 car3...                               = object

                        It is used to achieve abstraction and multiple inheritance.
                        
                        To inherite interface we use 'implement'

                        All methods are public, abstract & without implementation.
                        Used to achieve total abstraction.
                        Variables in the interface are final, public and static.



12. Static keyword :-                                                                   Java_18.java
        static keyword in java is used to share the same variable or method of a given class.
        1. property
        2. functions
        3. blocks
        4. nested classes

        e.g. :- 
                If we have a class 'Student' having properties 'name, roll_no, school' and methods 'marks(), percentage()'
                & have objects of this class like s1, s2, s3
                So all these object will have same school name... so its a static



























*/