import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        while(n2 != 0){
            int temp = n2;
            n2 = n1  % n2;
            n1  = temp;
        }
        System.out.println("HCF: " + n1);
    }
}
