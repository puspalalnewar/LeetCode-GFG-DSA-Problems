public class majorityEle {

    public static int majorityElement(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }
        int size = arr.length / 2;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                    if (temp >= size) {
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Input: arr[] = [3, 1, 3, 3, 2]
        // Output: 3
        // Explanation: Since, 3 is present more than n/2 times, so it is the majority
        // element.
    }
}
