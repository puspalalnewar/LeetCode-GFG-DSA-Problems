public class columnWithMaxZeros {

    public static int columnWithMaxZeros(int arr[][], int N) {

        int col = -1;
        int maxZeros = 0;

        for (int i = 0; i < N; i++) {
            int countZeros = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 0) {
                    countZeros++;
                }
            }
            if (countZeros > maxZeros) {
                maxZeros = countZeros;
                col = i;
            }
        }
        return col;
    }

    public static void main(String[] args) {
        int N = 3;
        int M[][] = {
                { 0, 0, 0 },
                { 1, 0, 1 },
                { 0, 1, 1 }
            };
        System.out.println(columnWithMaxZeros(M, N));
    }
}
