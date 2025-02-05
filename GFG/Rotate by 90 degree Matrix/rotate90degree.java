public class rotate90degree {

    public static void rotateby90(int mat[][]) {
        int newMat[][] = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                newMat[j][i] = mat[i][mat.length - j - 1];
            }
        }
        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat.length; j++) {
                mat[i][j] = newMat[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        rotateby90(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
