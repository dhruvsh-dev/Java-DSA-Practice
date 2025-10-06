
import java.util.Arrays;


public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {12,55,66},
            {22,58,69,96},
            {85,74,25,63}
        };
        int target=69;
        int ans[]=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }     
    static int[] search(int[][]arr,int target){
        for(int row = 0;row < arr.length;row++){
            for (int col = 0; col< arr[row].length;col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //max
    static int searchMax(int[][]arr){
        int max= arr[0][0];
        for(int row = 0;row < arr.length;row++){
            for (int col = 0; col< arr[row].length;col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }



}
