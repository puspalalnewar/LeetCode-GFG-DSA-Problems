public class romanToInt {

    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M':
                    num = 1000;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'I':
                    num = 1;
                    break;
            }
            if (4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        // Input: s = "III"
        // Output: 3
        // Explanation: III = 3.
    }
}
