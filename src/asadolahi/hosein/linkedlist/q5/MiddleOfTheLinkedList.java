package asadolahi.hosein.linkedlist.q5;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        int counter = 0;
        ListNode temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        for (int i = 0; i < counter / 2; i++) {
            head = head.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
