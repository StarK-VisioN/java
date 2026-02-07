// SubString

public class java_8 {
    public static String substring(String str, int startIdx, int endIdx) {
        String subStr = "";
        for(int i=startIdx; i<endIdx; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));   // 5 will not be included
    
        // inbuild function for substring
        System.out.println(str.substring(0,5));
    }
}







