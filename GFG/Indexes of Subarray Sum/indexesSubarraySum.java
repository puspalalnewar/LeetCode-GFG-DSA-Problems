import java.util.*;
public class indexesSubarraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int counter = 0;
            for(int j = i; j<n; j++){
                counter += arr[j];
                if(counter == target){
                    ans.add(i + 1);
                    ans.add(j + 1);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }

    public static void main(String args []){
        int arr[] = {1, 2, 3, 7, 5};
        System.out.println(subarraySum(arr, 12));
    }
}