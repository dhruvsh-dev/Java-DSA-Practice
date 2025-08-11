import java.util.Scanner;

public class PerimeterofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * 3.14 * radius;

        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
