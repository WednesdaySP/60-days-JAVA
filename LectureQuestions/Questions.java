package LectureQuestions;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // boolean ans=isPrime(n);
        // System.out.println(ans);

        // int digits=printArmstrong(n);
        // System.out.println(digits);

        System.out.println(isArmstrong(n));
        for(int i=0;i<=1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();

        

    }

    //Q2: print all 3 digits armstrong numbers
    public static int printArmstrong(int n) {
        int sum=0;
        while(n>0){
            int rem=n%10;
            int cube=rem*rem*rem;
            sum+=cube;
            n/=10;
        }
        return sum;

    }
    //Q3: is armstrong 
    //Armstrong number: the numbers in which the sum of cube of its individual digits is equal to the number itself.
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            int cube=rem*rem*rem;
            sum+=cube;
        }
        return sum==original;
    }
    //Q1: prime number
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c >n;
    }

}
