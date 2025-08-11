
import java.util.Scanner;

public class PrimeCheck {

    static void isPrime(int num){
        if(num<=1){
            System.out.println("Not Prime");
            return;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println("Not Prime");
            return;
            }
        }
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        isPrime(num);
    }
}
