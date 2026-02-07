/*

SORTING :- 
        Arrange in order.


Basic Algorithms :- 

        1. Bubble sort                                                                                  java_1.java
        2. Selection sort                                                                               java_2.java
        3. Insertion sort                                                                               java_3.java
        4. Counting sort (Advance)



1. Bubble Sort :-                                                                                                       
                simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order. 
                It keeps going through the list until it is completely sorted.


2. Selection Sort :- 
                We find the smallest ele and push it to first.
                Selection Sort does not do repeated swaps — it usually does one swap per pass.

        e.g. :- Unsorted: [5, 4, 1, 3, 2]
                1st pass: Smallest is 1 → swap with 5: [1, 4, 5, 3, 2]
                2nd pass: Next smallest is 2 → swap with 4: [1, 2, 5, 3, 4]
                …and so on.


3. Insertion Sort :- 
                Pick and element from unsorted part & place in the right position in sorted part.
                One element at a time.

                1. Start with the second element (index 1), because the first element by itself is already “sorted”.
                2. Take the current element and compare it with the elements before it.
                3. Shift larger elements one position to the right to make space.
                4. Insert the current element at its correct position.
                5. Repeat this for all elements in the array.




Inbuilt Sort :-                                                                                 java_4.java
        An inbuilt function to sort an array.
        Syntax :-
                import java.util.Arrays;
                Arrays.sort(arr);

        Time complexity :- O (n log n)          .. more optimised time complexity than Bubble, Selection & Insertion sort

                -or-
                Arrays.sort(arr, start, end);           this end is non inclusive.


        For Descending ->                                                                       java_5.java
                import java.util.Collections;
                Arrays.sort(arr, Collections.reverseOrder());

                -or-
                Arrays.sort(arr, start, end, Collections.reverseOrder());
                



Counting sort :-                                                                                java_6.java
                sorts integers by counting the number of occurrences of each unique element.
                Instead of comparing elements like Bubble Sort or Quick Sort, it counts them and uses this information to put them in order.








 */