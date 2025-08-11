import java.util.Scanner;

public class VolumeofPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the baseLength: ");
        double baseLength=sc.nextDouble();
        System.out.print("Enter the baseWidth: ");
        double baseWidth=sc.nextDouble();
        System.out.print("Enter the height: ");
        double height=sc.nextDouble();
        
        double volume = (1.0 / 3) * baseLength * baseWidth * height;
        System.out.println("Volume of Pyramid: " + volume);
    }
}
