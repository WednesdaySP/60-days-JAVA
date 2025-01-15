import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int [][] arr={
            {23,5,7},
            {23,454,77,4,2},
            {21,56,2},
            {9,78,64,53,27,65}
        };
        int target=2;
        int[] ans=search(arr, target); //format of return value {row,col}
        // int ans2=max(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println((max(arr)));
    }

    static int[] search(int [][] arr, int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target) {
                    return new int[]{row,col};
                    
                }
            }
        }
        return new int[]{-1,-1};
    }


    //max
    static int max(int [][] arr){
        int max=Integer.MIN_VALUE;
        if(arr.length==0){
            return -1;
        }
        for(int[] ints:arr){
            for(int element:ints){
                if (element>max) {
                    max=element;
                }
            } 
        }
        return max;

    }
}
