public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        // Loop n times (once for each pair (xi, yi))
        for (int i = 0; i < n; i++) {
            // Place xi at the even index (2*i)
            // xi is located at index i in the original array
            result[2 * i] = nums[i];
            
            // Place yi at the odd index (2*i + 1)
            // yi is located at index i + n in the original array
            result[2 * i + 1] = nums[i + n];
        }
        
        return result;
    }
}
