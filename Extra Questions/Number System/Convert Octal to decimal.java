import java.util.*;

public class Main {
    public static void main(String[] args) {

        int octal = 157;
        int decimal = 0;
        int power = 0;

        while (octal != 0) {
            int digit = octal % 10;
            decimal += digit * Math.pow(8, power);
            octal /= 10;
            power++;
        }

        System.out.println(decimal);
    }
}
