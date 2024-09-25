package Assignments;
import java.util.*;

public class CurrencyConvertor {
    //ques 6:Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rupees: ");
        double rupees = sc.nextDouble();
        double usd = rupees * 0.012;
        double yen= rupees * 1.72;
        double eur=rupees * 0.011;
        double krw= rupees * 15.91;
        System.out.println("USD is: " + usd);
        System.out.println("YEN is: " + yen);
        System.out.println("EUR is: " + eur);
        System.out.println("KRW is: "+ krw);
    }
}
