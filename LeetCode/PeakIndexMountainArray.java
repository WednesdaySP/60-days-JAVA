package LeetCode;
//https://leetcode.com/problems/find-peak-element/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int [] arr={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in  dec part of arr
                //this may be the ans, but look at left
            //this is why end!=mid -1
                end=mid;
            }
            else{
                //you are in asc part of arr
                start=mid+1;// bec we know that mid +1 elem > mid elem
            }
        }

        //int the end, start== end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max elem in the above 2 checks
        //hence when they are pointing to just one elem that is max one becasuse that is what the checks say
        //more eleboration: at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
        return start;
    }
    
}
