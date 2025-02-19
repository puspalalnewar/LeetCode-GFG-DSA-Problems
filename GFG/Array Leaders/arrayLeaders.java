import java.util.*;

public class arrayLeaders {

    static ArrayList<Integer> leaders(int arr[]) {
        int curr_lea = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= curr_lea) {
                curr_lea = arr[i];
                ans.add(curr_lea);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        // Input: arr = [16, 17, 4, 3, 5, 2]
        // Output: [17, 5, 2]
        // Explanation: Note that there is nothing greater on the right side of 17, 5
        // and, 2.
    }
}