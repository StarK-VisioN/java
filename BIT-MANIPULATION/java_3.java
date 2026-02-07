// get ith bit

public class java_3 {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;           // a*2^b    ...   a=1, b=i
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));
    }
}



