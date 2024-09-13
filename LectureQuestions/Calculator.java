package LectureQuestions;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans=0;
        scanner.close();

        while(true){
            System.out.println("Enter a operator: ");
            char opr=scanner.next().trim().charAt(0);

            if(opr=='+' || opr== '-' || opr=='*' || opr=='/' || opr=='%'){
                System.out.println("Enter first number: ");
                int num1=scanner.nextInt();
                System.out.println("Enter second number: ");
                int num2=scanner.nextInt();

                if(opr=='+'){
                    ans=num1+num2;
                }
                if(opr=='-'){
                    ans=num1-num2;
                }
                if(opr=='*'){
                    ans=num1*num2;
                }
                if(opr=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                    else{
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                }
                if(opr=='%'){
                    if(num2!=0){
                        ans=num1%num2;
                    }
                    else{
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                }
                // else{
                //     System.out.println("Error! Invalid operator.");
                // }
            }
            else if(opr=='q' || opr=='Q'){
                break;
            }
            else{
                System.out.println("Error! Invalid operator.");
            }
            System.out.println(ans);
        }
         
    }
}
