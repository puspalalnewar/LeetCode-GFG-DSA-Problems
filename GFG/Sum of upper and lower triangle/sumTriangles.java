import java.util.*;

public class sumTriangles {

    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count += matrix[i][j];
            }
        }
        ans.add(count);
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                count += matrix[i][j];
            }
        }
        ans.add(count);
        return ans;
    }

    public static void main(String[] args) {
        // Input:
        // N = 3 
        // mat[][] = {{6, 5, 4},
        //            {1, 2, 5}
        //            {7, 9, 7}}
        // Output: 
        // 29 32
        // Explanation:
        // The given matrix is
        // 6 5 4
        // 1 2 5
        // 7 9 7
        // The elements of upper triangle are
        // 6 5 4
        //   2 5
        //     7
        // Sum of these elements is 6+5+4+2+5+7=29.
        // The elements of lower triangle are
        // 6
        // 1 2
        // 7 9 7
        // Sum of these elements is 6+1+2+7+9+7= 32.
    }
}
