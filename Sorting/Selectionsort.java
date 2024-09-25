package Sorting;
import java.util.Arrays;

public class Selectionsort {
    //select an element and put it on its correct index
    //send the largest number to its position i.e at last of the array
    public static void main(String[] args) {
        int[] arr = {64, 25, 0, -12, 22, 11};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int [] arr){
        int n=arr.length;
    

        for(int i=0;i<n;i++){
            //find max item in remaining arr and swap with correct index 
            int last=n-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);

        }
    }

    static void swap(int [] arr, int first, int second){
        int temp=arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int [] arr, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
