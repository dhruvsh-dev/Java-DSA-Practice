import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}