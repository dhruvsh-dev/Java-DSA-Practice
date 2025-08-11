import java.util.Scanner;

public class SubtractProductAndSum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int prod=1,sum=0;

        while(num!=0){
            int digit=num%10;
            sum+=digit;
            prod*=digit;
            num=num/10;
        }
        System.out.println("Subtract of product and sum of given number: "+(prod-sum));

    }
}