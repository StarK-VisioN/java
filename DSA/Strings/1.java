/*

Strings :- 
        A String is a sequence of characters.
        In Java, String is not a primitive data type — it’s an object of the String class.
        Strings in Java are immutable, which means once created, they cannot be changed.

        Q. Why are Strings immutable in Java?
            A String is immutable because once it’s created, its value cannot be changed.
            Any operation that seems to “change” a String actually creates a new String object in memory.

            e.g. :- 
                    String s1 = "Hello";            Both s1 and s2 point to the same object in the pool.
                    String s2 = "Hello";

                    If Strings were mutable, changing s1 would also change s2 — that would break the entire idea of sharing Strings safely!


How to create a string ?                                                                java_1.java                                       
        String name = "Java";
        String name = new String("Java");


Input in String :-                                                                      java_1.java
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);


length() :-                                                                             java_2.java
                Also counts white spaces too.


concatenation :-                                                                        java_3.java


charAt() :-                                                                             java_4.java
                It returns the character at a specific index in a string.



Q. Check if a string is Palindrome                                                      java_5.java

                Palindrome strings are :-  "racecar"  "noon"  "madam"  



Q. Given route contains 4 direction "Norht Eest West South",  find the shortest         java_6.java
   path to reach destination
                "WNEENESENNN"


Quality of strings                                                                      java_7.java


Substring :-                                                                            java_8.java
        A continuos small part of the string

        Hello World      ->       substring      ->         loW     


Q. For a given set of strings print largest string                                      java_9.java
        "apple" "mango" "banana"




StringBuilder                                                                                                                                   java_10.java
        Mutable sequence of characters, used to create and modify strings more efficiently than using regular String objects.

        Common methods :- 
                | Method                                  | Description                     |
                | --------------------------------------- | ------------------------------- |
                | `append(String s)`                      | Adds text at the end            |
                | `insert(int offset, String s)`          | Inserts text at specified index |
                | `delete(int start, int end)`            | Deletes a portion of the string |
                | `replace(int start, int end, String s)` | Replaces a part of the string   |
                | `reverse()`                             | Reverses the string             |
                | `toString()`                            | Converts to a regular `String`  |


Q. For a given string convert each the first letter of each word to UPPERCASE           java_11.java
        hi, i am niraj


Q. String compression                                                                   java_12.java
                aaabbbccddd             a3b3c2d3
        if      abc                     a1b1c1  ...  not allowed

















*/