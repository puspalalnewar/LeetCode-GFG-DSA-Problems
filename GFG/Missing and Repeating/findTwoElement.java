import java.util.ArrayList;

public class findTwoElement {

    public static ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int missing = -1, repeating = -1;

        // Check each number from 1 to n
        for (int i = 1; i <= n; i++) {
            int count = 0;

            // Count occurrences of i in arr
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                repeating = i;
            } else if (count == 0) {
                missing = i;
            }

            // Stop early if both numbers are found
            if (missing != -1 && repeating != -1) {
                break;
            }
        }
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(200);
    }
}