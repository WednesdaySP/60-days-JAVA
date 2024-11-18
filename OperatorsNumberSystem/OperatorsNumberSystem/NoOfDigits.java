public class NoOfDigits {
    public static void main(String[] args) {

        // time complexity= log(n) times
        int n=2345;
        int base=2;//binary form
        int ans= (int)(Math.log(n)/ Math.log(base))+1;

        System.out.println(ans);
    }
}
