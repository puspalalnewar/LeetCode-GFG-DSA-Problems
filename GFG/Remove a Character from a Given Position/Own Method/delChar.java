public class delChar {

    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char ch = 'e';
        System.out.println(removeChar(str, ch));
    }
}
