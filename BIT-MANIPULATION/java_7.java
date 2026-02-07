// Clear last i bit

public class java_7 {

    public static int clearLast(int n, int i) {
        int bitMask = ~0<<i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearLast(15,2));
    }
}


