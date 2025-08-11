
import java.util.Scanner;

public class CurvedSurfaceAreaofCylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius=sc.nextDouble();
        System.out.print("Enter the height: ");
        double height=sc.nextDouble();

        double csa = 2 * 3.14* radius * height;
        System.out.println("Curved Surface Area of Cylinder: " + csa);
    }
}
