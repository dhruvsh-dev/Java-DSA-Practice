
import java.util.Scanner;


public class DiscountOnProduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the amount of product: ");
        double productPrice=sc.nextDouble();
        System.out.print("Enter the discount on product in % : ");
        double Discount=sc.nextDouble();

        double discount=(productPrice*Discount)/100;
        System.out.println("Discounted Price: " + (productPrice - discount));
    }
}
