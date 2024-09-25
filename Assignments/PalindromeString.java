package Assignments;

public class PalindromeString {
    //ques 8: To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        String str="abcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-i-1);

            if(start!=end){
                return false;
            }
           
    
        }
        return true;
    }
}
