import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number to find average: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 0; i < n; i++) sum += sc.nextInt();
        System.out.println("Average: " + (sum / (double) n));
    }
}

