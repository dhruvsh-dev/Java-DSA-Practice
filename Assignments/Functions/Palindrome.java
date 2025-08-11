
import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit=num%10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=sc.nextInt();
        System.out.println("Is Palindrome: " + isPalindrome(num));
    }
}
