public class minRow {

    public static int minRow(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int minOnes = Integer.MAX_VALUE;
        int minRowIndex = -1;
        
        for (int i = 0; i < n; i++) {
            int countOnes = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    countOnes++;
                }
            }
            
            if (countOnes < minOnes) {
                minOnes = countOnes;
                minRowIndex = i + 1; // 1-based index
            }
        }
        
        return minRowIndex;
    }

    public static void main(String[] args) {
        // Input: mat = [[1, 1, 1, 1], [1, 1, 0, 0], [0, 0, 1, 1], [1, 1, 1, 1]]
        // Output: 2
        // Explanation: Rows 2 and 3 contain the minimum number of 1's (2 each). Since, row 2 is less than row 3. Thus, the answer is 2.
    }
}
