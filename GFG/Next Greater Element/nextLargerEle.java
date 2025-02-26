import java.util.*;

public class nextLargerEle {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int currEle = arr[i];
            boolean track = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > currEle && track == true) {
                    ans.add(arr[j]);
                    track = false;
                }
            }
            if (track == false) {
                track = true;
            } else {
                ans.add(-1);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(nextLargerElement(arr));
    }
}
