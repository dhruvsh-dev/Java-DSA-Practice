import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost: ");
        double cost = sc.nextDouble();
        System.out.print("Enter the rate: "); 
        double rate = sc.nextDouble();
        int years = sc.nextInt();
        System.out.print("Enter the years: ");
        double value = cost * Math.pow((1 - rate / 100), years);
        System.out.println("Depreciated Value: " + value);
    }
}
