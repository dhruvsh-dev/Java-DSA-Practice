import java.util.Scanner;

public class DistancePoints {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the coordinate x1: ");
        double x1=sc.nextDouble();
        System.out.print("Enter the coordinate y1: ");
        double y1=sc.nextDouble();
        System.out.print("Enter the coordinate x2: ");
        double x2=sc.nextDouble();
        System.out.print("Enter the coordinate x2: ");
        double y2=sc.nextDouble();

        double distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.print("Distance: "+distance);
    }
}
