public class largestElement {
    
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10, -1};
        System.out.println("Largest Element : " + largest(arr));
    }
}
