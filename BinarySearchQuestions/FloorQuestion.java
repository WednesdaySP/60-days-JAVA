package BinarySearchQuestions;

//time complexity: O(log n)

public class FloorQuestion {
    //floor: greatest number which is smaller or equal to target
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};//sorted array therefore apply binary search
        int target=17;
        System.out.println(floor(arr, target));
    }
    //find the greatest no  <=target
    static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
         //but what if the target is smaller than the smallest no in the array
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
        return end;
    }
}
