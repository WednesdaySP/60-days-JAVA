package FunctionTopics;
import java.util.Arrays;

public class VariableArgs {
    //when we do not know how many inputs we are giving
    //symbol: ...any name
    //varibale length arguments
    //length is not constant
    //varibale length arguments should always come at the end or as the last parameter.
    public static void main(String[] args) {
        //we can use varargs to pass variable number of arguments
        //we can pass any number of arguments
        fun(4,5,9,43,45,6,54,34,35,566,76,8,78,4,989,89,8,8);
        //internally store it in an array.


        //multiple types of varibles
        multipleTypeVar(4, 20, "happy","to","be", "me","myself","the ","original","version","😉");
        
    }
    static void multipleTypeVar(int a, int b, String ...v){

    };
    static void fun(int ...v){ //v is implicitly declared as an array of type int
        System.out.println(Arrays.toString(v));
    }
}
