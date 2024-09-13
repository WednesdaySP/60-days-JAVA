package ArrayTopics;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int [][] arr=new int[3][3];

    //for input
    for(int row=0;row<arr.length;row++){
        //now for each col of each row
        for(int col=0;col<arr[row].length;col++){
            //System.out.println("Enter the element at row "+row+" col "+col+" :");
            arr[row][col]=sc.nextInt();
           // System.out.print(arr[row][col]+ "");;
        }
        

    }

    // //output
    // for(int row=0;row<arr.length;row++){
    //     //now for each col of each row
    //     for(int col=0;col<arr[row].length;col++){
    //         //System.out.println("Enter the element at row "+row+" col "+col+" :");
           
    //         System.out.print(arr[row][col]+ " ");;
    //     }
    //     System.out.println();

    // }

    // for(int row=0;row<arr.length;row++){
    //     System.out.println(Arrays.toString(arr[row]));
    // }

    //enhanced for loop
    for(int[] row:arr){
        System.out.println(Arrays.toString(row));
    }

   }
}
