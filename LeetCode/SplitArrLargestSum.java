package LeetCode;
//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArrLargestSum {
    public static void main(String[] args) {
        int [] nums={7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(nums, k));
    }
    static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start, nums[i]); //min possible ans will be the max number in array
            end+=nums[i]; //max possible ans will be the sum of all elements of array
        }

        //binary search
        while(start<end){
            int mid=start+(end-start)/2;

            //calculate how many pices you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                
                if(sum+num > mid){
                    //you cannot add it in the subarray, make new one
                    //say you add this in new subarray, then sum=num
                    sum=num;
                    pieces++;
                }else{
                    //you can add it in the subarray, say you add this in subarray, then
                    sum+=num;
                }
               

            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
           
        }
        return start;
        
    }

    
}
