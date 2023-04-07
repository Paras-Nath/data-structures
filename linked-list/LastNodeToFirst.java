public class LastNodeToFirst {
    
    public static void main(String[] args) {
        ListNode head = ListNode.create(null, 0);
        head = ListNode.create(head, 1);
        head = ListNode.create(head, 2);
        head = ListNode.create(head, 3);
        // head = ListNode.create(head, 4);
        // head = ListNode.create(head, 5);

        System.out.println("\nbefore");
        ListNode.print(head);

        head = lastToFirst(head);

        System.out.println("\nafter");
        ListNode.print(head);
    }

    public static ListNode lastToFirst(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode t_head = head;
        while(t_head.next.next != null) {
            t_head = t_head.next;
        }
        
        t_head.next.next = head;
        head = t_head.next;
        t_head.next = null;
        return head;
    }
}
