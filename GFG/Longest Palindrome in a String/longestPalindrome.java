public class longestPalindrome {

    static String longestPalindrome(String s) {
        int n = s.length();
        String longest = "";
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String substr = s.substring(i, j + 1);
                if (isPalindrome(substr) && substr.length() > longest.length()) {
                    longest = substr;
                }
            }
        }
        return longest;
    }
    
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        // Input: s= "aaaabbaa"
        // Explanation: The longest palindromic substring is "aabbaa". 
        // Output: "aabbaa"

        String s = "aaaabbaa";
        System.out.println(longestPalindrome(s));

    }
}