package Recusions;

public class NoOfZeros {
    public static void main(String[] args) {
        System.out.println(count(30204));
    }

    static int count(int n){
        return zeros(n,0);
    }

    //special pattern, how to pass a value to above calls
    static int zeros(int n, int count){
        
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return zeros(n/10, count+1);
        }
        return zeros(n/10, count);
    }
}
