package Recusions;

public class fiboRec {
    public static void main(String[] args) {
        // int n=10;
        // System.out.println(fibo(n));

        // for(int i=0;i<11;i++){
        //     System.out.println(fiboFormula(i));
        // }
        System.out.println(fiboFormula(50));
      
    }
    static long fiboFormula(int n){
        //return (int) ((Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1- Math.sqrt(5))/2), n))/Math.sqrt(5)); //original formula
        return (long) (Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5) );   ///formula after removing less domainating terms.
    }

    static int fibo(int n){
      
     if(n<2){
            return n;
        }
            return fibo(n-1)+ fibo(n-2);
        
    }
}
