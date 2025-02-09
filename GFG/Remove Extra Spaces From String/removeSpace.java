public class removeSpace {
    public static void main(String[] args) {
        String str = "      Hello         World";
        System.out.println(str.length());
        // trim() returns string value
        // str = str.trim();
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
    }
}
