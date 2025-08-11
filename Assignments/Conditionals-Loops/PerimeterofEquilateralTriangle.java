
import java.util.Scanner;

public class PerimeterofEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side=sc.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle: " + perimeter);
    }
}
