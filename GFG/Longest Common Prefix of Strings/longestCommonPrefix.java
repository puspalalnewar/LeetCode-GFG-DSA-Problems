public class longestCommonPrefix {

    public static String findCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        
        String prefix = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        // Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
        // Output: "gee"
        // Explanation: "gee" is the longest common prefix in all the given strings.
    }
}
