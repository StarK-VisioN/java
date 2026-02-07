// charAt() & printing all letters of string

public class java_4 {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name = "Niraj Hatote";
        // System.err.println(name.charAt(0));

        printLetters(name);
    }
}
