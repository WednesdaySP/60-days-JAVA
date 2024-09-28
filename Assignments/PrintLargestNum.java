

import java.util.Scanner;

public class PrintLargestNum {
    //ques 5: Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println("Largest number is: "+ a);
        }
        if(a==b){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println("Largest number is: "+ b);

        }
        
    }
}
