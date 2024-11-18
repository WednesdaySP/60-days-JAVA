public class SumOfNthRow {
    public static void main(String[] args) {
        int n=6;
        int ans= 1 << (n-1); // 1*2^(n-1)
        System.out.println(ans);
    }
}
