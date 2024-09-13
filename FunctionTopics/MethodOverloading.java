package FunctionTopics;
import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        //same name, datatype, but different arguments/parmeters
        fun(7);
        fun("sp");
       int ans= mul(45, 8);
        int result=mul(9, 4, 45);
        System.out.println(ans);
        System.out.println(result);
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a){
        System.out.println("first");
    }
    static void fun(String a){
        System.out.println("second");
    }
    static int mul(int a, int b, int c){
        return a+b+c;
    }
    static int mul(int a, int b){
        return a+b;
    }
}
