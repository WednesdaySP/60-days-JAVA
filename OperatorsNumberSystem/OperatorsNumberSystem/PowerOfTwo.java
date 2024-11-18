public class PowerOfTwo {
    public static void main(String[] args) {
        int n=31; //fixed for n=0 i.e true
        boolean ans =(n & (n-1)) == 0;
        System.out.println(ans);
    }
}
