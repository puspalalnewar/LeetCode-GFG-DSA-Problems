import java.util.*;

public class twoSum {

    public static boolean twoSum(int arr[], int target) {
        // code here
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[i] + arr[j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(arr[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int target = 5;

        System.out.println(twoSum(arr, target));
    }
}