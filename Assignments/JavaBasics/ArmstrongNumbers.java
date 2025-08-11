import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int orignalNum=num;
        while(num!=0){
            int rem=num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        if(sum==orignalNum){
            System.out.println("It is an Armstrong number");
        }else{
             System.out.println("It is not an Armstrong number");
        }
    }
}
