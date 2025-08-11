import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int lcm = (n1 * n2) / hcf(n1, n2);
        System.out.println("LCM: " + lcm);
    }

    static int hcf(int n1, int n2) {
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
