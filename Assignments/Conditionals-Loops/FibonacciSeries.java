
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the number of term: ");
        int term=sc.nextInt();
        int t0=0,t1=1;

        for(int i=1;i<=term;i++){
            System.out.print(t0+" ");
            int nextTerm=t0+t1;
            t0=t1;
            t1=nextTerm;
        }
    }
}
