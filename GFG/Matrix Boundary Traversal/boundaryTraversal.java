import java.util.*;

public class boundaryTraversal {

    public static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList <Integer> list = new ArrayList<>();
        // Top
        for(int i = 0; i<mat.length-1; i++){
            list.add(mat[0][i]);
        }
        // Right
        for(int j = 0; j<mat[0].length-1; j++){
            list.add(mat[j][mat[0].length-1]);
        }
        // Bottom
        for(int i = mat.length-1; i > 0; i--){
            list.add(mat[mat.length-1][i]);
        }
        // Left
        for(int j = mat[0].length-1; j > 0; j--){
            list.add(mat[j][0]);
        }
        
        return list;

    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(boundaryTraversal(mat));
    }
}
