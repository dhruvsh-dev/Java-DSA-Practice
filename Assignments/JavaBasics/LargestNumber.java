import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first number: ");
        num1=in.nextInt();
        System.out.print("Enter second number: ");
        num2=in.nextInt();

        if(num1<num2){
            System.out.println("Second number is big");
        }else{
            System.out.println("First number is big");
        }
    }
}
