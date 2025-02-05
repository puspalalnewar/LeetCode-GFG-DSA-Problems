import java.util.*;

public class sortCol {

    public static void colWiseSort(int mat[][], int rowLen, int colLen) {
        int A[][] = transpose(mat, rowLen, colLen);
        rowWiseSort(A);
        mat = transpose(A, colLen, rowLen);
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int mat[][], int rowLen, int colLen) {
        int tr[][] = new int[colLen][rowLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                tr[j][i] = mat[i][j];
            }
        }
        return tr;
    }

    public static void rowWiseSort(int mat[][]) {
        for (int i = 0; i < (int) mat.length; i++) {
            Arrays.sort(mat[i]);
        }
    }

    public static void main(String[] args) {
        // Input
        int[][] mat = { { 1, 6, 10 },
                { 8, 5, 9 },
                { 9, 4, 15 },
                { 7, 3, 60 } };

        int N = mat.length;
        int M = mat[0].length;
        colWiseSort(mat, N, M);
    }
}
