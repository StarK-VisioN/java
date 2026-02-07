// Q. Product of a & b
public class java_3 {
    
    public static int multiply(int a, int b) {
        int product = a*b;
        System.out.println("product = " + product);
        return product;
    }
    
    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        multiply(a, b);
    }
}


// OR More correct ->

public class java_3 {
    
    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    
    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);
        prod = multiply(2, 10);
        System.out.println("a * b = " + prod);
    }
}