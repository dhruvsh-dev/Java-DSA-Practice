
import java.util.Scanner;

public class AreaofEquilateralTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side=sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilateral Triangle: " + area);
    }    
}