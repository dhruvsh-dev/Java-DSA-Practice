
import java.util.Scanner;

public class Circle {
    static void printCircleInfo(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius to find Area and Circumference of a circle: ");
        double radius=sc.nextDouble();
        printCircleInfo(radius);
    }
}
