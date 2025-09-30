import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        int[] result = getConcatenation(arr); 
        System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
