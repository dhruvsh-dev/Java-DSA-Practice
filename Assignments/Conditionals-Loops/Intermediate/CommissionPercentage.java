import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sale: ");
        double sale = sc.nextDouble();
        System.out.print("Enter Commission: ");
        double commissionRate = sc.nextDouble();
        double commission = (commissionRate / 100) * sale;
        System.out.println("Commission: " + commission);
    }
}
