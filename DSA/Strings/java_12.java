// Q. String compression
        // aaabbbccddd             a3b3c2d3
        // if      abc                     a1b1c1  ...  not allowed


public class java_12 {
    public static String compress(String str) {
        String newStr = "";

        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1) {              // because if string having aaab    then here, cant compare a & b so directly add 'a' to new string with its count
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aaabbbcccdd";
        System.out.println(compress(str));
    }
}


