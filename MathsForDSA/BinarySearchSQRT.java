package MathsForDSA;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.println(sqrt(n, p));;
    }

    static double sqrt(int n, int p){
        int start=0;
        int end=n;

        double root =0.0;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(mid*mid == n){
                root=mid;
                return mid;
            }

            if(mid*mid > n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
            double incr=1.0;
            for(int i=0;i<p;i++){
                while(root*root <=n){
                    root+=incr;
                }

                root -=incr;
                incr /=10;

            }
            
        return root;

    }
}
