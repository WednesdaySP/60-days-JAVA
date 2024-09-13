import java.util.*;
public class Strings {
    @SuppressWarnings("removal")
    public static void main (String [] args){
        float a=27.567f;
        System.out.printf("Formatted number is %.2f",a );
        System.out.println();
        //% is used as placeholder
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s","Shashi","Hot");
        //%s =String datatype
        System.out.println();

        ////////////////////////////////////////////////
        //operators
        System.out.println('a'+'b'); //op 195
        System.out.println("a"+"b"); // ab
        System.out.println('a'+3); // 100 i.e a+1=b,a+2=c,a+3=d and ascii d=100
        System.out.println((char)('a'+ 3)); //d
        System.out.println("a"+ 3);//a3
        //this is same as after a few steps "a"+ "3"
        //integer will be converted to Integer that will call toString()
        System.out.println("Shashi"+ new ArrayList<>()); //Shashi[]

        //Note: java internally converts all the objects to string when println is used with a string.
        //      So we can use any object with println() method of print stream class.

        System.out.println("Shashi"+ new Integer(27)); //Shashi27

        System.out.println( new ArrayList<>() +""+ new Integer(27));
        //new ArrayList<>() + new Integer(27) it will show an error as we can only use primitive datatype in println method
        //and also atleast one side should be string type to print any other datatype values
        //since arraylist and Interger are two complex datatypes to print them we have to add a string in the print statement
        // - operator can't be used

        //operator overloading is supported in c++ and python
        //but it can be performed in java only for strings i.e concatination

    }
    
}
