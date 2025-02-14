
public class sumOfMatrix {

    public static int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                sum += Grid[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(sumOfMatrix(3, 3, mat));
    }
}
