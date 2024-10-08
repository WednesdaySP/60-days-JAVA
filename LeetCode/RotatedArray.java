package LeetCode;
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1396704327/
public class RotatedArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,9,2,3};
        int target=5;
       System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int pivot=findPivot(arr);
        
        //pivot not found
        if(pivot==-1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        //if pivot found, you have found two asc sorted array
        if(arr[pivot]==target){
            return pivot;
        }
        if(target >=arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target,int start, int end){
        
        
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
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid< end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
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

    static int findPivotwithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid< end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if elements at middle, start, end are equal then just skip the duplicates
            else if(arr[mid]<=arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were pivet??
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot 
                if (arr[end]<arr[end-1]) {
                    return end-1;
                    
                }
                end--;
            }
            //left side is sorted, so pivot should be in right side
            else if(arr[start]<arr[mid] || (arr[start]== arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
