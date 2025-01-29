// import java.util.*;
public class arraySearch {

    public static int search(int arr[], int x) {

        // Your code here
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int target = 3;
        System.out.println("Index : " + search(arr, target));
    }
}
