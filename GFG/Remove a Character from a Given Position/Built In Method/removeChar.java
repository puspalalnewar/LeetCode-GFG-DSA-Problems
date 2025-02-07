public class removeChar {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}