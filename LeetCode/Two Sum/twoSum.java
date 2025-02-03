public class twoSum {

    public static int[] twoSum(int[] nums, int target) {

        int result[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int target = 5;
        int ans[] = twoSum(arr, target);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
