package ArrayTopics;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //array of primitives
        int [] arr=new int[5];
        arr[0]=23;
        arr[1]=34;
        arr[2]=89;
        arr[3]=8;
        arr[4]=90;
        //System.out.println(Arrays.toString(arr));

        //input using loops
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }

        // for(int num:arr){ //for every element in array, print the element
        //     System.out.print(num+" "); //here num represents element of the array
        // }

        // System.out.println(arr[6]);//index out of bound error

        // //array of objects
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="Shashi"; //modifying
        System.out.println(Arrays.toString(str)); //changing original object

    }
}
