public class FindNUniqueIntegersSumUpToZero {
    //Q.22
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // Pair positive and negative numbers
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If n is odd, include 0
        if (n % 2 == 1) {
            result[index] = 0;
        }

        return result;
    }
}
