package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-34,-27,-8,0,2,4,6,9,11,12,14,20,36,48};
        int target=36;
        int result=binarySearch(arr,target);
        System.out.println(result);
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        
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
        return -1;

    }
}
