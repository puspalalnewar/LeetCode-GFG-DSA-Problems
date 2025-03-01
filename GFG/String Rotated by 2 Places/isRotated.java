public class isRotated {

    public static boolean isRotated(String s1, String s2) {
        if (s1.length() < 2) {
            return false;
        }
        String newStr = s1.substring(s1.length() - 2);
        newStr += s1.substring(0, s1.length() - 2);
        s1 += s1.substring(0, 2);
        if (s1.substring(2).equals(s2)) {
            return true;
        } else if (newStr.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Input: s1 = "amazon", s2 = "azonam"
        // Output: true
        // Explanation: "amazon" can be rotated anti-clockwise by two places, which will
        // make it as "azonam".

    }
}
