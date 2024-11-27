package Recusions;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    //--n  vs n--
    // concept
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(--n); // --n it first subtracts then passes the value to the function

        //--n  vs n--

    }

    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n--); // it first gives the value to function and then subtracts that results in passing 5 again and again without subtracting
        // gives infinite recyurssion and only prints 5 infinite times

        

    }
}
