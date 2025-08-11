import java.util.Scanner;

public class SumTill0isEntered {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number: ");
        while(true){
            int num=sc.nextInt();
            if(num==0) break;
            sum+=num;
        }
        System.out.print("Sum of all given number is :"+sum);
    }
}
