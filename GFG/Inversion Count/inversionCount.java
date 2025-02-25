public class inversionCount {

    static int inversionCount(int arr[]) {
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Input: arr[] = [2, 4, 1, 3, 5]
        // Output: 3
        // Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
    }
}
