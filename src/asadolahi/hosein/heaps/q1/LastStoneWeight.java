package asadolahi.hosein.heaps.q1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            int diff = Math.abs(x - y);
            if (diff != 0) {
                pq.add(diff);
            }
        }
        return pq.size() == 1 ? pq.peek() : 0;
    }
}
