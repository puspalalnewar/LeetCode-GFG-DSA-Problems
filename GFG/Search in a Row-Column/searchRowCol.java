public class searchRowCol {

    public static boolean matSearch(int mat[][], int x) {
        // your code here
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
        // Output: false
        // Explanation: 62 is not present in the matrix, so output is false.
        int mat[][] = {
            {3, 30, 38},
            {20, 52, 54},
            {35, 60, 69}
        };
        int x = 60;

        System.out.println(matSearch(mat, x));
    }
}