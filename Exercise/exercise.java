import java.util.*;
public class exercise {


    public String reverseWords(String s) {
        // Code here
        
        String[] nStr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i = nStr.length-1; i >= 0; i--){
            sb.append(nStr[i]).append(" ");
        }
        return sb.toString();
        
        
    }
    

    

    public static void main(String[] args) {
        String str = "    I am       Puspalal         Newar        "; 

        String newstr[] = str.trim().split("\\s+");

        for (String s : newstr) {
            System.out.print(s + " ");
        }


        
    }
}