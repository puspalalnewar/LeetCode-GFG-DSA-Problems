import java.util.*;
public class exercise {

    

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
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

        System.out.println(list);
        
    }
}