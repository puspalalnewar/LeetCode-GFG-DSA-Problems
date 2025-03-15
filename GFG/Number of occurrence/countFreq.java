public class countFreq {

    public static int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
        // Output: 4
        // Explanation: target = 2 occurs 4 times in the given array so the output is 4.
    }
}
