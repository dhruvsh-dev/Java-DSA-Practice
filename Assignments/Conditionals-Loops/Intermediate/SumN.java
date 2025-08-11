
import java.util.Scanner;

public class SumN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("How many numbers do you want to sum: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }
        System.out.print("Total Sum: "+sum);
    }
}