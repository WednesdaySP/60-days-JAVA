package Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
       // int[] arr={-34,-27,-8,0,2,4,6,9,11,12,14,20,36,48};//assending
        int [] arr={99,89,70,67,58,47,39,20,14,10,6,3,2,1};//descending
        int target=39;
        int result=orderAgnosticBS(arr,target);
        System.out.println(result);
    }
    static int orderAgnosticBS(int [] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsending =arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsending){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
