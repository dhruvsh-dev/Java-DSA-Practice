import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units: ");
        double units = sc.nextDouble();
        double bill = 0;
        if (units <= 100) bill = units * 1.5;
        else if (units <= 200) bill = 100 * 1.5 + (units - 100) * 2.5;
        else bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        System.out.println("Bill: ₹" + bill);
    }
}