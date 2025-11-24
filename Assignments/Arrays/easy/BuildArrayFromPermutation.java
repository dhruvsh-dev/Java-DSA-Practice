import java.util.Arrays;

public class BuildArrayFromPermutation {
    //Q1
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(arr); 
        System.out.println(Arrays.toString(result));
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length; 

        // encode new values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }
 
        // decode to final values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}
