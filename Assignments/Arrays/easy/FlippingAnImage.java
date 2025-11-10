public class FlippingAnImage {
    //Q.13
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left = 0, right = row.length - 1;
            
            // Flip and invert in one pass
            while (left <= right) {
                // Swap and invert simultaneously
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }
}
