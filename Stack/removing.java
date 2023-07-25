import java.util.Stack;

public class removing {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        
        for (char character : s.toCharArray()) {
            if (character == '*') {
                stack.pop();
            } else {
                stack.push(character);
            }
        }

        for (Character c : stack) {
            res.append(c);
        }

        return res.toString();
    }
}