package LeetCode.GreekForGreeks;

public class ElementInInfiniteArray {
    public static void main(String[] args) {
        int [] arr={2,4,5,6,7,8,9,13,15,16,17,18,19,24,26,27,29,32};
        int target=15;
        System.out.println(ans(arr, target));
        
    }
    static int ans(int [] arr, int target){
        //find range
        //first startnwith box of size 2
        int start=0;
        int end=1;

        //condition till we find the exact range in which our  target lies
        while(target> arr[end]){
            int newStart=end+1;
            //new end which is double the size of previous box size
            end=end+(end-start+1)*2; //similar to end +(sizeOfBox)*2
            //new start
            start=newStart;
        }
        return search(arr, target, start, end);
    }

    static int search(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]> target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
