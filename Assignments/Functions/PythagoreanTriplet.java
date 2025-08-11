import java.util.Scanner;

public class PythagoreanTriplet {
    static boolean isTriplet(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        return x * x == (y * y )+ (z * z);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (isTriplet(a, b, c)) {
            System.out.println("It is a Pythagorean Triplet.");
        } else {
            System.out.println("It is NOT a Pythagorean Triplet.");
        }

        sc.close();
    }
}
