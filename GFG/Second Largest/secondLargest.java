import java.util.*;

public class secondLargest {

    public static int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        for(int i = arr.length-1;i > 0; i--){
            if(arr[i] > arr[i-1]){
                return arr[i-1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {12, 35, 1, 10, 34, 1};
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(getSecondLargest(arr));
    }
}
