package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class ping {
    
}

class RecentCounter {
    private Queue<Integer> que;

    public RecentCounter() {
        que = new LinkedList<>();
    }
    
    public int ping(int t) {
        que.offer(t);

        while (que.peek() < t - 3000) {
            que.poll();
        }

        return que.size();
    }
}
