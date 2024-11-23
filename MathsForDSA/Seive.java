package MathsForDSA;

public class Seive {
    //space complexity: O(n)
    public static void main(String[] args) {
        int n=40;
        // a boolean array which stores numbers till n+1 and marks prime numbers as  false and non prime numbers as true.
        boolean[] primes=new boolean[n+1];
        System.out.println(primes[0]);
        seive(n, primes);

    }

    //this loop first checks if the number is prime by checking prime[i]==false, if yes it means that the num , is prime so the second loop runs in which allthe multiples of that prime number are marked as true i.e they are already visited so no need to check the true numbers as they are not prime.
    static void seive(int n, boolean[] primes){
        for(int i=2;i * i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;

                }
            }
        }

        //this loop takes are the values which are prime and then prints them.
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
