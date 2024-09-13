package LectureQuestions;
import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int c=2;
        if(n<=1){
            System.out.println("Prime");
        }
        while (c*c <=n) {
            if(n%c==0){
                System.out.println("Not Prime");
                break;
            }
            c++;
            
        }
        if(c*c>n){
            System.out.println("Prime");
        }

    }
    
}
