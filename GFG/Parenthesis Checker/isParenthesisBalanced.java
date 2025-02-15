import java.util.*;
public class isParenthesisBalanced {
    static boolean isParenthesisBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '{' || curr == '(' || curr == '[') {
                stack.push(curr);
            } else if (stack.empty()) {
                return false;
            } else {
                if (s.charAt(i) == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    if (stack.pop() != '{') {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isParenthesisBalanced(s));
    }
}
