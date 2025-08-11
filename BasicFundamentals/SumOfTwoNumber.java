import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number: ");
        a=in.nextInt();
        System.out.print("Enter second number: ");
        b=in.nextInt();

        int sum=a+b;
         System.out.print("sum of two number are :"+sum);
    }    
}
