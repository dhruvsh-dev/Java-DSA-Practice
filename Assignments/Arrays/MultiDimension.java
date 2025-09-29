import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //No. of rows and important to declare 

        // int[][] arr= new int[5][];
        // arr =new int[][]{
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8}
        // };

        //Input

        int[][] arr = new int[3][2];

        for(int row=0;row<arr.length;row++){
            //For each col
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=sc.nextInt();
            }
        }

        //Output
        // for(int row=0;row<arr.length;row++){
        //     //For each col
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //2nd way to print output

        for (int row = 0; row <arr.length; row++) {
            System.out.print(Arrays.toString(arr[row])); 
            System.out.println();           
        }

        //3rd way
        for(int[] num:arr){
            System.out.print(Arrays.toString(num)); 
            System.out.println();           
        }

    }
}
