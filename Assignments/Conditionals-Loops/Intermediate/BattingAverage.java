import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter runs:");
        int runs = sc.nextInt();
        System.out.print("Enter innings:");
        int innings = sc.nextInt();
        System.out.print("Enter notOuts:");
        int notOuts = sc.nextInt();
        double avg = runs / (double)(innings - notOuts);
        System.out.println("Batting Average: " + avg);
    }
}
