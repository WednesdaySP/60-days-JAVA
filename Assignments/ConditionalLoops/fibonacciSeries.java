package ConditionalLoops;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int t1=0, t2=1;
        int count=2;
        System.out.println("Fibonacci Series: ");
        while(count<=n){
            int temp=t1;
            t1=t2;
            t2=temp+t2;
            System.out.print(t2+" ");
            count++;
        
        }
    }
    
}
