import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time: ");
        double t = sc.nextDouble();
        double amount = p * Math.pow((1 + r / 100), t);
        System.out.println("Compound Interest: " + (amount - p));
    }
}
