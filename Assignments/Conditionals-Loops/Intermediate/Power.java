import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("Enter the power number: ");
        int power=sc.nextInt();
        int result=1;

        while(power>0){
            result*=num;
            power--;
        }
System.out.print("Result: "+result);
    }
}
