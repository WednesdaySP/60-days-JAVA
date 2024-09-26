package LeetCode;
//https://leetcode.com/problems/valid-palindrome/
public class ValidPlaindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
     static boolean isPalindrome(String s) {
        if(s.length()==0 || s.isEmpty() || s==" "){
            return true;
        }
        String str=s.replaceAll("[^A-Za-z0-9]", "");
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
