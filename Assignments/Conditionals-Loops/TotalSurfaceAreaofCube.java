
import java.util.Scanner;

public class TotalSurfaceAreaofCube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side=sc.nextDouble();
        
        double tsa = 6 * side * side;
        System.out.println("Total Surface Area of Cube: " + tsa);
    }
}
