
import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        int facttorail=1;
        for (int i = 1; i <= n; i++) {
            facttorail *= i;
        }
        return facttorail;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int num=sc.nextInt();
        System.out.print("Factorial: "+fact(num));
    }
}
