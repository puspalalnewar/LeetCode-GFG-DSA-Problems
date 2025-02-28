public class areRotations {

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        // Input: s1 = "abcd", s2 = "cdab"
        // Output: true
        // Explanation: After 2 right rotations, s1 will become equal to s2.
    }
}
