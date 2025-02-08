import java.util.*;

public class anagramOfStr {

    public static boolean areAnagrams(String s1, String s2) {
        // Your code here
        String first = sortString(s1);
        String second = sortString(s2);
        
        return first.equals(second);
        
    }
    public static String sortString(String s){
        char tempArr[] = s.toCharArray();
        Arrays.sort(tempArr);
        // Returning new sorted string
        return new String(tempArr);
    }

    public static void main(String[] args) {
        String str1 = "Puspalal";
        String str2 = "lalPuspa";
        System.out.println(areAnagrams(str1, str2));
    }

}
