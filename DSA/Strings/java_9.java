// Q. For a given set of strings print largest string 

// here will use function of string i.e.    compareTo()

public class java_9 {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i = 0; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0 ) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}


