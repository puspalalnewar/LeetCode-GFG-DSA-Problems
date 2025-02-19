import java.util.*;

public class snakePattern {

    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> s = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < matrix[r].length; c++) {
                    s.add(matrix[r][c]);
                }
            } else {
                for (int c = matrix[r].length - 1; c >= 0; c--) {
                    s.add(matrix[r][c]);

                }

            }
        }
        return s;
    }

    public static void main(String[] args) {

        // Input: N = 3, matrix[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
        // Output: 45 48 54 87 89 21 70 78 15
        // Explanation: Printing it in snake pattern will lead to the output as 45 48 54
        // 87 89 21 70 78 15.

    }
}
