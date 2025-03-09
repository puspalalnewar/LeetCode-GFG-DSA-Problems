public class maxSubarray {

    public static int maxSubArray(int[] nums) {
        // int ms = nums[0];
        // int cs = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     cs += nums[i];
        //     if (cs < 0) {
        //         cs = 0;
        //     }
        //     ms = Math.max(cs, ms);
        // }
        // return ms;

        int res = nums[0];
        int total = 0;
        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }
            total += n;
            res = Math.max(res, total);
        }
        return res;
    }

    public static void main(String[] args) {
        // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        // Output: 6
        // Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        int arr[] = {
                -2, 1, -3, 4, -1, 2, 1, -5, 4
        };
        System.out.println(maxSubArray(arr));
    }
}
