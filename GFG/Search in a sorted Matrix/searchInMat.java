public class searchInMat {

    public static boolean searchMatrix(int[][] mat, int x) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
        // Output: true
        // Explanation: 14 is present in the matrix, so output is true.
    }
}
