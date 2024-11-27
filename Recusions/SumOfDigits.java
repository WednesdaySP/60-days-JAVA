package Recusions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digits(1342));
    }

    static int digits(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + digits(n/10);
    }
}
