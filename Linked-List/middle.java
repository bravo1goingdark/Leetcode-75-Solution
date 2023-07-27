public class middle {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            // The list is empty or has only one node (middle node does not exist)
            return null;
        }
    
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
    
        // Use the slow and fast pointers to find the middle node
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
    
        // Now slow points to the middle node, and prev points to the node before the middle node
    
        if (prev == null) {
            // The middle node is the first node, so update the head
            head = head.next;
        } else {
            // Remove the middle node by updating the 'next' pointer of the previous node
            prev.next = slow.next;
        }
    
        return head;
    }
}
