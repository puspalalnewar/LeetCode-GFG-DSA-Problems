import java.util.*;

public class nextLargerEle {

    // public static ArrayList<Integer> nextLargerElement(int[] arr) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         int currEle = arr[i];
    //         boolean track = true;
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[j] > currEle && track == true) {
    //                 ans.add(arr[j]);
    //                 track = false;
    //             }
    //         }
    //         if (track == false) {
    //             track = true;
    //         } else {
    //             ans.add(-1);
    //         }

    //     }
    //     return ans;
    // }

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1)); 
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(nextLargerElement(arr));
    }
}
