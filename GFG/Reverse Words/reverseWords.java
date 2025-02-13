public class reverseWords {

    public static String reverseWords(String s) {
        String[] nStr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = nStr.length - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(nStr[i]);
            } else {
                sb.append(nStr[i]).append(" ");
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "    I am a   student  ";
        System.out.println(reverseWords(s));
    }
}
