
import java.util.Scanner;

public  class CombinationsPermutations{
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,r;
        System.out.print("Enter N: ");
        n=sc.nextInt();
        System.out.print("Enter R: ");
        r=sc.nextInt();
        int nCr=factorial(n)/(factorial(r)*factorial(n-r));
        int nPr = factorial(n) / factorial(n - r);
        System.out.println("nCr: " + nCr);
        System.out.println("nPr: " + nPr);
    }
}