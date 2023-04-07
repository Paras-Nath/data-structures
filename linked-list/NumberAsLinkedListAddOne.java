public class NumberAsLinkedListAddOne {

    public static void main(String[] args) {
        ListNode head = ListNode.create(null, 0);
        head = ListNode.create(head, 0);
        head = ListNode.create(head, 0);
        // head = ListNode.create(head, 3);
        // head = ListNode.create(head, 4);
        // head = ListNode.create(head, 5);

        System.out.println("\nbefore");
        ListNode.print(head);

        head = driver(head);

        System.out.println("\nafter");
        ListNode.print(head);
    }

    public static ListNode driver(ListNode head) {

        int carry = addOne(head);
        if (carry > 0) {
            ListNode t_head = new ListNode(carry);
            t_head.next = head;

            head = t_head;
        }

        return head;
    }

    public static int addOne(ListNode head) {
        if (head == null)
            return 0;
        if (head.next == null) {
            head.data += 1;
            if (head.data > 9) {
                head.data %= 10;
                return 1;
            }
            return 0;
        }

        head.data += addOne(head.next);
        if (head.data > 9) {
            head.data %= 10;
            return 1;
        }
        return 0;
    }
}
