
import java.util.Scanner;

public class Voting {
    static void VerifyAge(int age){
        System.out.println(age>=18 ? "You are eligible":"Not Eligible");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        VerifyAge(age);
    }
}
