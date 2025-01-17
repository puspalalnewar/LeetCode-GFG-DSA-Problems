import java.util.*;;

public class findDuplicates {

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        
        // Sort the array
        Arrays.sort(arr);
        
        // Traverse the sorted array and check for duplicates
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // Avoid adding the same duplicate multiple times
                if (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != arr[i]) {
                    duplicates.add(arr[i]);
                }
            }
        }
        
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);  // Output: [2, 3]
    }
}