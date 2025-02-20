import java.util.*;
public class firstOccurence {

    static int firstOccurence(String txt, String pat) {
        if (txt.contains(pat)) {
            return txt.indexOf(pat);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstOccurence("Hello", "el"));
    }
}
