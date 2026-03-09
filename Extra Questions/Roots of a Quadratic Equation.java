import java.util.*;

public class Main {
    static void findRoots(int a, int b, int c) {

        if (a == 0) {
            System.out.print("imaginary");
            return;
        }

        int D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.print("imaginary");
            return;
        }

        int sqrtD = (int)Math.sqrt(D);

        int r1 = (int)Math.floor((-b + sqrtD) / (2.0 * a));
        int r2 = (int)Math.floor((-b - sqrtD) / (2.0 * a));

        if (r1 < r2) {
            int temp = r1;
            r1 = r2;
            r2 = temp;
        }

        System.out.print(r1 + " " + r2);
    }

    public static void main(String[] args) {
        int a = 1, b = -7, c = 12;
        findRoots(a, b, c);
    }
}
