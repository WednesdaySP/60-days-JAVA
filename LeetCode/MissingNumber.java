package LeetCode;
//https://leetcode.com/problems/missing-number/
//Amazon Question
//solved using cyclic sort in approch 1
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,3,2};
        System.out.println(missingNum(nums));
    }
    //approch 1
    static int missingNumber(int [] nums){
        int i=0,N=nums.length;
        while(i<N){
            int current=nums[i];
            if(current<N && nums[current]!=nums[i]){
                swap(nums,i,current);
            }
            else {
                i++;
            }
        }
          //case 1
    //search for first missing number
    for(int index=0;index<N;index++){
        if(nums[index]!=index){
            return index;
        }
    }
    //case 2
    return N;
    }

    static void swap(int [] nums, int i, int elem){
        int temp=nums[i];
        nums[i]=nums[elem];
        nums[elem]=temp;
    }

    //another approch
    static int missingNum(int [] arr){
        int sum=0, n=arr.length;
        int naturalNoSum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int MissingNumber=naturalNoSum-sum;
        return MissingNumber;
    }
  
    
}



