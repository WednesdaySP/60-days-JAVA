package LectureQuestions;
import java.util.Scanner;

public class DuplicateCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();

        System.out.println("Enter num to find:");
        int dup=sc.nextInt();
        sc.close();
        int count=0;

       while(num>0){
        int rem=num%10;
        if(rem==dup){
            count++;
        }
        num/=10;
       }
        System.out.println(count);
    }
}
