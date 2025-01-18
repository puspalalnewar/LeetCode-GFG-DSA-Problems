import java.util.*;

public class thirdLargest {

    public static int thirdLargest(int arr[]) {
        // Your code here
        Arrays.sort(arr);
        return arr[arr.length-3];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(thirdLargest(arr));
    }
}