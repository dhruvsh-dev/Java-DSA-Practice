
import java.util.Scanner;

public class EvenOdd {
    static void CheckEvenOdd(int num){
        if(num==1 || num ==0){
            System.out.print("Odd");
        }else{
        System.out.println(num%2==0?"Even":"Odd");}
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to check Odd or Even: ");
        int num= sc.nextInt();
        CheckEvenOdd(num);
    }
}
