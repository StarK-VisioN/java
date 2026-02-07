// Q. Print STAR Pattern

public class java_1 {
    public static void main(String args[]) {
        for(int line = 1; line <=4; line++){            // how much horizontal lines i want to print ?
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();               // for each line print come to next line
        }
    }
}