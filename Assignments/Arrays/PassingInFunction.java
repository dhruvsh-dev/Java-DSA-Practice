import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr=new int[5];
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[]arr){
        arr[0]=80;
    }
}
