import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses_stack {
    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {

            }
        }
        return false;
    }
}
