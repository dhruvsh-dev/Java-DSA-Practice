
import java.util.Scanner;

public class PerimeterofParallelogram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        double base=sc.nextDouble();
        System.out.print("Enter the side of parallelogram: ");
        double side=sc.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("Perimeter of Parallelogram: " + perimeter);
    }
}
