package LeetCode;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,3,1};
        int target=3;
        System.out.println(findInMountainArray(target, arr));
    }
    static int findInMountainArray(int target, int[] arr) {
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr, target, 0, peak);
        if(firstTry!=-1){
           return firstTry;
            
        }
        
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
        

    }
    static int peakIndexInMountainArray(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid] < arr[mid + 1]) {
                // We are in the increasing part
                start = mid + 1;
            } else {
                // We are in the decreasing part, peak might be at mid
                end = mid;
            }
        }
        return start;

    }
    static int orderAgnosticBS(int [] arr, int target,int start, int end){
        boolean isAsending=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsending){
                if(arr[mid]< target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            
        }
        return -1;
    }

}
