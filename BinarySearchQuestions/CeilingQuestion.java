package BinarySearchQuestions;

//time complexity: O(log n)

public class CeilingQuestion {
    //ceiling means the smallest element in array that is greater or equal to target.
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};//sorted array therefore apply binary search
        int target=17;
        System.out.println(ceiling(arr, target));
    }

    //return the index of smaleest no >= target
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        //but what if the target is greater than the greatest no in the array
        if(target > end){
            return -1;
        }
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
