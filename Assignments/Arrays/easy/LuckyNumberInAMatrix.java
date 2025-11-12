import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInAMatrix {
    //Q.23
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            // Step 1: Find the minimum element in this row
            int minVal = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if it's the maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) result.add(minVal);
        }

        return result;
    }
}
