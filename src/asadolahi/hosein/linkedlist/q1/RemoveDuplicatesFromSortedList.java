package asadolahi.hosein.linkedlist.q1;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(head != null) {
            if (temp.next == null) {
                break;
            }
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        ListNode() {}
    }
}
