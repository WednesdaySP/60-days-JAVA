package Sorting;

import java.util.Arrays;

public class BubbleSort {
    //also known as  Sinking sort or Exchange sort 
    //in every step we compare adjacent elements
    public static void main(String[] args) {
        int[] arr={2,-4,6,1,5,-3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    //with first parse largest element comes to end
    // in second parse 2nd largest element comes to 2nd last place and so on
    static void bubble(int [] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped =false;
            //for each step, max element will come at the last representative index
            for(int j=1;j<arr.length-i;j++){
                //swap if item is smaller than previous one 
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }
            }

            //if you did not swap for a perticular value of i, it means the arr is sorted hence stop the program
            if(!swapped){ //!false =true
                break;
            }


        }
    }
}
