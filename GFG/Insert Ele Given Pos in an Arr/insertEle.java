public class insertEle {

    public static void insertAtPos(int arr[], int pos, int ele) {
        // Shifting elements to the right
        if (pos == 0 || pos > arr.length) {
            System.out.println("Invalid Position!!");
            return;
        }
        int n = arr.length - 1;
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the new element at index pos - 1
        arr[pos - 1] = ele;
        System.out.print("Arr after insertion \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 0 };
        insertAtPos(arr, 7, 10);
    }
}
