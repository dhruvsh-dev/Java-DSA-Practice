import java.util.*;

public class Main {
    public static void main(String[] args) {

        int decimal = 156;
        String octal = "";

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal = decimal / 8;
        }

        System.out.println(octal);
    }
}
