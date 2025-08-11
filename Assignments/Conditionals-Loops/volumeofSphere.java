import java.util.Scanner;

public class volumeofSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double volume = (4.0 / 3) * 3.14 * (radius*radius*radius);
        System.out.println("Volume of Sphere: " + volume);
    }
}
