public class kadaneSum {

    public static int kadansSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs > maxSum) {
                maxSum = cs;
            }
            if (cs < 0) {
                cs = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(kadansSum(arr));
    }
}
