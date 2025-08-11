import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Find Simple Interest");
        System.out.print("Enter Principal amount: ");
        float p = in.nextFloat();
        System.out.print("Enter Rate %: ");
        float r = in.nextFloat();
        System.out.print("Enter Time (in year): ");
        float t = in.nextFloat();

        float interest = (p * r * t) / 100;
        System.out.println("Simple Interest = " + interest);
    }
}
