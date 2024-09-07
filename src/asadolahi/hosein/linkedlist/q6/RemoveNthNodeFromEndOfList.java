package asadolahi.hosein.linkedlist.q6;

import asadolahi.hosein.linkedlist.q5.MiddleOfTheLinkedList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count == 1) {
            return null;
        }
        n = count - n;
        if (n == 0) {
            return head.next;
        }
        temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, MiddleOfTheLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
