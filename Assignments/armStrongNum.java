package Assignments;

public class armStrongNum {
    //ques 9: To find Armstrong Number between two given number.
    
    public static void main(String[] args) {
        int num1=0;
        int num2=153;
        System.out.println("Armstrong numbers between " + num1 + " and " + num2 + " are:");
        for (int i = num1; i <= num2; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
    static boolean isArmstrong(int num){
        int originalNum=num;
        int sum=0;
        int digits = countDigits(num);
        while(num>0){
            int rem=num%10;
            //int cube=rem*rem*rem;
            sum += Math.pow(rem, digits);
            num/=10;

        }
        return num==originalNum;
    }
      // Function to count the number of digits in a number
      static int countDigits(int num) {
        return Integer.toString(num).length();
    }
}
