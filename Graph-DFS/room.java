import java.util.List;
import java.util.Stack;

public class room {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int totalroom = rooms.size();
        boolean[] visited = new boolean[totalroom];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0] = true;


        while (!stack.isEmpty()) {
            int currroom = stack.pop();

            for (Integer key : rooms.get(currroom)) {
                if (!visited[key]) {
                    stack.push(key);
                    visited[key] = true;
                }
            }
        }

        for (boolean bool : visited) {
            if (!bool) {
                return false;
            }
        }

        return true;
    }
}