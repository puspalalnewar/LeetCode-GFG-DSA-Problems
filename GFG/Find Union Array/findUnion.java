import java.util.*;

public class findUnion {

    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        int idx = 0;
        int mergeArr[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            mergeArr[idx] = a[i];
            idx++;
        }
        for (int i = 0; i < b.length; i++) {
            mergeArr[idx] = b[i];
            idx++;
        }
        for (int i = 0; i < mergeArr.length; i++) {
            hs.add(mergeArr[i]);
        }

        return hs.size();
    }

    public static void main(String[] args) {
        // Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
        // Output: 5
        // Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3};
        System.out.println(findUnion(a, b));
    }
}
