import java.util.Scanner;

public class PerimeterofSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side=sc.nextDouble();

        double PerimeterofSquare= 4*side;
        System.out.println("Perimeter of square: "+PerimeterofSquare);
    }    
}
