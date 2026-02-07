// Linear search

// import java.util.*;

// public class java_4 {

//     public static int linearSearch(int marks[], int key) {                      // returnType is    -> int as we are using  'return'
//         for(int i =0; i< marks.length; i++) {
//             if(marks[i] == key){
//                 return i;
//             }
//         }
//         return -1;                      // if key is not present in array
//     }

//     public static void main(String args[]) {
//         int marks[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;                                        // find value = 10 & return its INDEX

//         int index = linearSearch(marks, key);
//         if(index == -1) {
//             System.out.println("NOT FOUND");
//         } else {
//             System.out.println("key is at index: " +index);
//         }
//     }
// }


import java.util.*;

public class java_4 {
    public static int linearSearch(String fruits[], String key){
        for(int i=0; i<fruits.length; i++) {
            if(fruits[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String fruits[] = {"mango", "banana", "cherry", "orange"};
        String key = "cherry";

        int index = linearSearch(fruits, key);
        if(index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("key is at index: " +index);
        }
    }
}

