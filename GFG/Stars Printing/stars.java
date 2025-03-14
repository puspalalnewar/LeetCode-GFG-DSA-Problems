public class stars {

    public static void triangleOne(int row, int col) {
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void triangleTwo(int row, int col) {
        for(int i = row; i >= 1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        triangleTwo(5, 5);
    }
}
