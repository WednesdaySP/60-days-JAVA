package BinarySearchQuestions;

public class CeilingQuestion {
    //ceiling means the smallest element in array that is greater or equal to target.
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,9,12,15,17,19,25};//sorted array therefore apply binary search
        int target=8;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
            }
            else if(arr[mid]>target){
                ans=mid;
            }
            else{
                ans=mid+1;
            }
        }
        return ans;
    }
}
