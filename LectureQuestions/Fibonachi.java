package LectureQuestions;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        int count=2;
        sc.close();
        // for(int i=0;i<n;i++){
        //     c=a+b;
        //     a=b;
        //     b=c;

        // }

        //or using while loop
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
         
    }
}
