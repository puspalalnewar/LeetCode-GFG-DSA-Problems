public class transposeMatrix {

    public static void transpose(int n, int mat[][]) {
        int newMat[][] = new int [mat.length][mat.length];
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                newMat[i][j] = mat[j][i];
            }
        }
        
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                mat[i][j] = newMat[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };
        transpose(mat.length, mat);
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}