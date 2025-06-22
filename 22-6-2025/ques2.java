import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String expr = "{[()]}";
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) isBalanced = false;
        System.out.println(isBalanced ? "Balanced" : "Not Balanced");
    }
}
