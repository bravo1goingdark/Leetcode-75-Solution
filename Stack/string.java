import java.util.Stack;

public class string {
    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(currentStr.toString());
                num = 0;
                currentStr = new StringBuilder();
            } else if (c == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentStr);
                }
                currentStr = temp;
            } else {
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }
    
}
