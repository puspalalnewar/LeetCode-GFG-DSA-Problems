public class isSubset {

    public boolean checkIsSubset(int a[], int b[]) {
        boolean visited[] = new boolean[a.length];
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j] && !visited[j]) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
        // Output: true
        // Explanation: b[] is a subset of a[]
    }
}
