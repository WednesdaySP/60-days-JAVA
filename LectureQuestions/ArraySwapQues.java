package LectureQuestions;

import java.util.Arrays;

public class ArraySwapQues {
    public static void main(String[] args) {
        int[] arr={2,5,34,65,8};
        //swap(arr, 1, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
   static void swap(int []arr, int index1, int index2){
    int temp=index1;
    arr[index1]=arr[index2];
    arr[index2]=temp;
   }
}
