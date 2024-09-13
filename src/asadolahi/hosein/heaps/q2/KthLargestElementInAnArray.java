package asadolahi.hosein.heaps.q2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int num : nums) {
            if (pq.size() < k) {
                pq.add(num);
            }
            else if (pq.peek() < num) {
                pq.poll();
                pq.add(num);
            }
        }
        return pq.peek();
    }
}
