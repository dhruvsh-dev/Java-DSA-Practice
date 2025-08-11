import java.util.Scanner;

public class MaxUntilZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
         System.out.println("Enter the number: ");
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
         if(n > max) max = n;
        }
        System.out.println("Max number: " + max);
    }
    
}
