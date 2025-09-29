import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        //you can add many elements
        // list.add(55);
        // list.add(56);
        // list.add(58);
        // list.add(59);


        // print
        System.out.print(list);        
        System.out.println();
        //Input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.print(list);        

         //print by index
         for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
    }
}
