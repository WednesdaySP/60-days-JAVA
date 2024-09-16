package Assignments;
import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        char opr=sc.next().trim().charAt(0);

        if(opr =='+'|| opr== '-' || opr=='/' || opr=='*' || opr=='%'){

            if(opr=='+'){
                System.out.println(a+b);
            }
            else if(opr=='-'){
                System.out.println(a-b);
            }
            else if(opr=='/'){
                if(b!=0){
                    System.out.println(a/b);
                }
            }
            else if(opr=='%'){
                System.out.println(a%b);
            }
            else if(opr=='*'){
                System.out.println(a*b);
            }
            else{
                System.out.println("Invalid Operator");
            }
        }
        else if(opr=='q'|| opr=='Q'){
            System.out.println("Exiting the program");
        }

    }
    
}
