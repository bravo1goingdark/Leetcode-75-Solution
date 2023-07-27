public class oddeven {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Keep track of the head of the even-indexed list

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead; // Append even-indexed list after the odd-indexed list
        return head;
    }
}

