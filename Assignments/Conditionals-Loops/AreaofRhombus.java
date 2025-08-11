import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of D1: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter the value of D2: ");
        double d2 = sc.nextDouble();

        double area = (d1 * d2) / 2;

        System.out.println("Area of Rhombus: " + area);
    }
}
