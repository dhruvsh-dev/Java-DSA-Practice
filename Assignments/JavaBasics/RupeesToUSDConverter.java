import java.util.Scanner;
public class RupeesToUSDConverter {
    public static void main(String[] args) {
        final double USD_RATE = 83.0; // Example rate,It can varry.
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the ammoun in INR: ");
        double INR=in.nextDouble();
        System.out.println("INR into USD= " + (INR/USD_RATE));

    }
}
