 package LeetCode;
///https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class EvenDigits {
     public static void main(String[] args) {
        int[] nums = {12,345,20,6,7896};
        int ans= findNumbers(nums);
        System.out.println(ans);
        System.out.println(digits2(ans));
     }
     static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
     }

     static boolean even(int num){
        int numberOfDigits=digits2(num);
        return numberOfDigits % 2==0;

     }
     static int digits2(int num){ //optimized
        if(num<0){
            num=num* -1;
        }
        return (int)(Math.log10(num))+1;
    }
    //  static int digits(int num){
    //     if(num <0){
    //         num=num*-1;
    //     }
    //     if(num==0){
    //         return 1;
    //     }
    //     int count=0;
    //     while(num>0){
    //         num/=10;
    //         count++;
    //     }
    //     return count;
    //  }

    
}