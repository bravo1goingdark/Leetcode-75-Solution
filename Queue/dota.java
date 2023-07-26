package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class dota {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                rQueue.offer(i);
            } else {
                dQueue.offer(i);
            }
        }

        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rIndex = rQueue.poll();
            int dIndex = dQueue.poll();

            if (rIndex < dIndex) {
                rQueue.offer(rIndex + senate.length());
            } else {
                dQueue.offer(dIndex + senate.length());
            }
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}

