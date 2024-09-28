
import java.util.*;

public class FibonacciSeries {
    //ques 7: To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+ " ");
        }

    }
    static int fibonacci(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp=a;
            a=b;
            b=temp+b;
            count ++;
        }
        return b;
    }
}
