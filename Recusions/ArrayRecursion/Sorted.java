package Recusions.ArrayRecursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr ={1,24,3,5,16,8,2};
        System.out.println(IsSorted(arr, 0));
        
    }

    static boolean IsSorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && IsSorted(arr,index+1);
    }
}
