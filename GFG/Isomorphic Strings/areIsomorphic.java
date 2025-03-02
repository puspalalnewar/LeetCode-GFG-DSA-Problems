import java.util.*;

public class areIsomorphic {

    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            hs.add(s1.charAt(i));
        }
        HashSet<Character> hsTwo = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            hsTwo.add(s2.charAt(i));
        }
        if (hs.size() == hsTwo.size()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Input: s1 = "aab", s2 = "xxy"
        // Output: true
        // Explanation: There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.
    }
}
