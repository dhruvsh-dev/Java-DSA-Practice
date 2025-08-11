import java.util.Scanner;

public class MaxMin {
    static void PrintMax(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println(max + " is max.");
    }

    static void PrintMin(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        System.out.println(min + " is min.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Enter any three numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        PrintMax(n1, n2, n3);
        PrintMin(n1, n2, n3);
        
        sc.close(); 
    }
}
