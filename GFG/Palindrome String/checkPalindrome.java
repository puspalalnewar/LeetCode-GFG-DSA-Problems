public class checkPalindrome {

    public static boolean isPalindrome(String s) {
        // code here
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
}