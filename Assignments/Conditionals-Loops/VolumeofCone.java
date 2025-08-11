
import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius= sc.nextDouble();
        System.out.print("Enter the height: ");
        double height= sc.nextDouble();

        double volume = (1.0 / 3) * 3.14 * radius * radius * height;
        System.out.println("Volume of Cone: " + volume);
    }
}
