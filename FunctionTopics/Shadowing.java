package FunctionTopics;
public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);//90
        System.out.println(Shadowing.x);//90
        int x=8; //class variable x=90 at line 2 is shadowed here. 
        System.out.println(x);//8
        fun();

        //imp point to note:
        int b; //declaraion
       // System.out.println(b);//error
        b=89; //shadowing and scope will begin only when value is initilised
        System.out.println(b);
        
    }
    static void fun(){
        System.out.println(x);//90
    }
}
