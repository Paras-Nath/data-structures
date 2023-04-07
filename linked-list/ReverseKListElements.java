public class ReverseKListElements {

    public static void main(String[] args) {
        ListNode head = ListNode.create(null, 0);
        head = ListNode.create(head, 1);
        head = ListNode.create(head, 2);
        head = ListNode.create(head, 3);
        // head = ListNode.create(head, 4);
        // head = ListNode.create(head, 5);

        System.out.println("\nbefore reverse");
        ListNode.print(head);

        head = ReverseKListElements.reverseKListElements(head, 2, 2);

        System.out.println("\nafter reverse");
        ListNode.print(head);
    }

    public static ListNode reverseKListElements(ListNode head, int n, int k) {
        if (head == null) return null;
        if (head.next == null) return head;

        if (n == 1) {
            head.next = reverseKListElements(head.next, k, k);
            return head;
        }

        ListNode t_head = reverseKListElements(head.next, --n, k);
        if(n==1) { head.next = t_head; ListNode.print(head); return head;}
        head.next = null;
        ListNode t_tail = t_head;
        while (t_tail.next != null) {
            t_tail = t_tail.next;
        }
        t_tail.next = head;
        return t_head;
    }
}
