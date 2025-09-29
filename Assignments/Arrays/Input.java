import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //Arrays of primitive 
        int[] arr= new int[5];
        arr[0]=23;
        arr[1]=43;
        arr[2]=57;
        arr[3]=55;
        arr[4]=44;
        System.out.println(arr[3]);

        System.out.println("Enter the inputs: ");
        //Input using for loops 
        for(int j=0;j<arr.length;j++){
            arr[j]= sc.nextInt();
        }

        // //Print using for loops 
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //Advanced For Loop
        for(int num:arr){
            System.out.print(num +" "); //Here num represents the elements of array 
        }

        //One more way to printing the arrays
        System.out.println(Arrays.toString(arr));

        //Arrays of Object 
        String[] str= new String[5];
        System.out.println("Enter the string inputs: ");
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //Modify 
        str[1]="Dhruv";
        



    }
}
