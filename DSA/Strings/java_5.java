// Q. Check if a string is Palindrome ->     Palindrome strings are :-  "racecar"  "noon"  "madam"  

public class java_5 {
    
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n= str.length();
            // condition for not a palindrome
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}



