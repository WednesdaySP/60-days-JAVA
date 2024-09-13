package LectureQuestions;
public class ReveseNum {
    public static void main(String[] args) {
        int num=9837634;

        int ans=0;
        while(num>0){
            int rem=num % 10;//to get reminder
            num /=10; //remove last digit
            ans=ans *10 +rem;
        }
        System.out.println(ans);
    }
}
