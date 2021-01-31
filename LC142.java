public class LC142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast != null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }
        fast = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
