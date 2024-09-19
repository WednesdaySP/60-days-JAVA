package LeetCode;

public class RotatedArray {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,9,5,4,3,2};
        int target=5;
        System.out.println(findPivot(arr, target, 0, arr.length-1));
        
    }
    static int findPivot(int[] arr,int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid< end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<target){
                return mid;

            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
