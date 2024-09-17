package LeetCode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
    char target='f';
    System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int n=letters.length;

       
        while(start<=end){
            int mid=start+(end-start)/2;

            if(letters[mid]==target){
                start=mid+1;
            }
             if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%n] ;
        
    }
    //exact same approch to ceiling of no.
    //ignore the target = what we are looking for
    //if target is greater than end, return first element
    //i.e: letters = {'c','f','j'} target= 'j', return 'c'
    //condition voilated: start=end +1
}
