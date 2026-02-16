public class validParentheses_bruteForce {
    public boolean isValid (String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s.replace("()", "");
            s.replace("[]", "");
            s.replace("{}", "");
        }
        return s.isEmpty();
    }
}
