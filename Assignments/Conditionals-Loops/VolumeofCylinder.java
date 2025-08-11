import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius= sc.nextDouble();
        System.out.print("Enter the height: ");
        double height= sc.nextDouble();

        double volume = 3.14 * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}
