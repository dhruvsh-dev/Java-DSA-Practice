
import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        while (num!=0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.print("Result="+sum);
    }
}