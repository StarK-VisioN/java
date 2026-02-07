// Q. For a given string convert each the first letter of each word to UPPERCASE

public class java_11 {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));         // always make 1st charecter to upperCase
        sb.append(ch);                                          // And append it

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
               sb.append(str.charAt(i)); 
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am niraj";
        System.out.println(toUpperCase(str));
    }
}

