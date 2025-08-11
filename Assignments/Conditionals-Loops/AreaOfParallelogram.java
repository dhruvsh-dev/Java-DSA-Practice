
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height=sc.nextDouble();
        System.out.print("Enter the base: ");
        double base=sc.nextDouble();
        
        double area = base * height;
        System.out.println("Area of Parallelogram: " + area);
    }
}
