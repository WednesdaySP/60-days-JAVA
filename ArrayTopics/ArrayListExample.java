package ArrayTopics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());

        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); //pass index here, list[index] will not work

        }
        System.out.println(list);
    }
}
