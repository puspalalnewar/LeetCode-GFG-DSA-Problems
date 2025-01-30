public class equilibriumPoint {

    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        // Input: arr[] = [1, 2, 0, 3]
        // Output: 2 
        // Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.

        int arr[] = {1, 2, 0, 3};
        System.out.println(findEquilibrium(arr));
        
    }
}