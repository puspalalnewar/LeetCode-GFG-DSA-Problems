public class rowWiseSort {

    static int sortRowWise(int m[][]) {
        // loop for rows of matrix
        for (int i = 0; i < m.length; i++) {
            // loop for column of matrix
            for (int j = 0; j < m[i].length; j++) {
                // loop for comparison and swapping
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        // swapping of elements
                        int t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }

        // printing the sorted matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args) {
        int m[][] = { { 9, 8, 7, 1 },
                { 7, 3, 0, 2 },
                { 9, 5, 3, 2 },
                { 6, 3, 1, 2 } };
        sortRowWise(m);
    }
}
