import java.util.Scanner;

public class SumCategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negSum = 0, evenSum = 0, oddSum = 0;
        System.out.print("Enter the number: ");
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            if(n < 0) negSum += n;
            else if(n % 2 == 0) evenSum += n;
            else oddSum += n;
        }
        System.out.println("Negative Sum: " + negSum);
        System.out.println("Positive Even Sum: " + evenSum);
        System.out.println("Positive Odd Sum: " + oddSum);
    }
}
