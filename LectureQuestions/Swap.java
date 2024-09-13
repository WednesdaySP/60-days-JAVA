package LectureQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Num1: ");
        // int a=sc.nextInt();

        // System.out.print("Num2:");
        // int b=sc.nextInt();
        // swap( a,  b);
        // System.out.println("Swap numbers: "+a+" "+b);


        int [] arr={1,3,45,6,4};
        changeValue(arr);
        System.out.println(Arrays.toString(arr)); //[20, 3, 45, 6, 4]
    }
    public static void swap(int a, int b){
        int temp=a;
         a=b;
         b=temp;
       //  System.out.println("Swapped numbers: "+a+" "+b);


    }

    static void changeValue(int [] nums){
        nums[0] = 20;
    }
}
