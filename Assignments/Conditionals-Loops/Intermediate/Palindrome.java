import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str= sc.nextLine();
        String reverseStr=new StringBuilder(str).reverse().toString();
        if(str.equals(reverseStr)){
            System.out.print("String is Palindrome");
        }
        else{
             System.out.print("String is not  Palindrome");
        }
    }
}
