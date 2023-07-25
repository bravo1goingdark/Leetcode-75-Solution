import java.util.Stack;

public class coll {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                // Positive asteroid, moving to the right
                stack.push(asteroid);
            } else {
                // Negative asteroid, moving to the left
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop(); // The right-moving asteroid explodes
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // Left-moving asteroid survives or both explode
                } else if (stack.peek() == -asteroid) {
                    stack.pop(); // Both asteroids explode
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
