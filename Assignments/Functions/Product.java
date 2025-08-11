
import java.util.Scanner;

public class Product {
    static double Prod(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        System.out.print("Sum of these numbers are "+Prod(n1, n2));
    }
}
