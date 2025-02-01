public class rowWithMax1s {

    public static int rowWithMax1s(int arr[][]) {
        int maxRowIndex = -1;
        int maxOnes = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                maxRowIndex = i;
            }
        }
        
        return maxRowIndex;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        
        System.out.println("Row with maximum 1s: " + rowWithMax1s(arr));
    }
}
