import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Factorial: ");
        int num=sc.nextInt();
        if(num==0 || num==1){
            System.out.print("Factorial: 1");
        }
        for(int i=1;i<=num;i++){
            fact*=i;
        }
         System.out.print("Factorial: "+fact);
    }
}
