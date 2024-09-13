package FunctionTopics;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String name="Shashi Prabha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.charAt(7));
        System.out.println(name.strip()); //remove white spaces
        System.out.println(Arrays.toString(name.split("s"))); 
        //splits into new words
    }
}
