package Assignments;
import java.util.Scanner;

public class Ass2 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int n=sc.nextInt();
        // System.out.println("Enter name: ");
        // String name=sc.nextLine();

        System.out.print("Principal:");
        double p=sc.nextDouble();
        System.out.print("Rate:");
        double r=sc.nextDouble();
        System.out.print("Time:");
        int t=sc.nextInt();
        simpleInterest(p, r, t);
       
        sc.close();

       // evenOdd(n);
        //greetingMsg(name);
        
    }
    //question 1: even odd program
    public static void evenOdd(int n){
        if(n%2==0){
            System.out.println("even ");
        }
        else{
            System.out.println("odd");
        }
    }

    //ques 2 greeting msg
    public static void greetingMsg(String name){
        String msg1="Hello, Welcome to ";
        String msg2="'s Laptop";
        System.out.println(msg1+name+msg2);
    }

    //ques 3 simple interest
    public static void simpleInterest(double p, double r, double t){
        double si=(p*r*t)/100;
        System.out.println("Simple Interest: "+si);
    }

    
}
