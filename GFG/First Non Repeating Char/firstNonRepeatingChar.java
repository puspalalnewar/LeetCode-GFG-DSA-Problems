public class firstNonRepeatingChar {

    public static char firstNonRepeatingChar(String s) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            boolean unique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return s.charAt(i);
            }
        }
        
        return '$';
    }


    public static void main(String[] args) {
        String s = "puspalal Newar";
        System.out.println(firstNonRepeatingChar(s));
    }
}
