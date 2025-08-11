
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height=sc.nextDouble();
        System.out.print("Enter the base: ");
        double base=sc.nextDouble();

        double area= 0.5 * (base*height);
        System.out.print("Area of triangle: "+area);
    }
}
