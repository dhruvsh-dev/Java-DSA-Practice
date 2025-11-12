public class CellsWithOddValuesInAMatrix {
    //Q.14
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        
        // Increment corresponding row and column counts
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }
        
        int count = 0;
        // Check each cell's parity
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
