import java.util.*;

public class Main {
    public static void main(String[] args) {

        int decimal = 13;
        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }

        System.out.println(binary);
    }
}
