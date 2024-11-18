public class nthMagicNumber {
    public static void main(String[] args) {
        int n=5;
        int base=5;
        int ans = 0;
        while(n>0){
            int last=n & 1;//gives last number in binary form i.e 110
            System.out.print(last);

            n= n >> 1; //removes the last digit on every iteration i.e 11, 0 removed
            ans +=last * base;
            base=base*5;//base is multiplied by 2 in every iteration
           
        }
        System.out.println();
        System.out.println(ans);
    }
}
