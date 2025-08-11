import java.util.Scanner;

public class PrimeRange {
    static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i < 2) continue;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.print("Prime numbers between " + start + " and " + end + ": ");
        printPrimes(start, end);

        sc.close();
    }
}
