import java.util.Scanner;
public class CalculatorUsingIf {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter First number: ");
        float num1=in.nextFloat();
        System.out.print("Enter Second number: ");
        float num2=in.nextFloat();
        System.out.print("Choose the  operator: + ,- ,x,/");
        char op=in.next().charAt(0);

        if(op == '+'){
           System.out.println("Sum: " + (num1 + num2));
        }else if(op == '-'){
             System.out.println("Sub: " + (num1 - num2));
        }
        else if(op == 'x'){
             System.out.println("Mul: " + (num1 * num2));
        }
        else if(op == '/'){
             System.out.println("Divide: " + (num1 / num2));
        }else{
            System.out.println("Invali Character");
        }
    }
}
