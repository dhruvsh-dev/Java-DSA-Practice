
import java.util.Scanner;

public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the baseArea:");
        double baseArea=sc.nextDouble();
        System.out.print("Enter the height:");
        double height=sc.nextDouble();
        
        double volume = baseArea * height;
        System.out.println("Volume of Prism: " + volume);
    }
}
