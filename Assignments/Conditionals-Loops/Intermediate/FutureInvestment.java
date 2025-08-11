
import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the years: ");
        int years = sc.nextInt();
        double futureValue = amount * Math.pow(1 + rate / 100, years);
        System.out.println("Future Value: " + futureValue);
    }
}
