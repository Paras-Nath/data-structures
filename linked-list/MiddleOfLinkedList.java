public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode head = Party.create(null, 1);
        head = Party.create(head, 2);
        head = Party.create(head, 3);
        head = Party.create(head, 4);
        Party.print(head);

        System.out.println("middle -"+ middle(head).data);
    }
    public static ListNode middle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode one = head, sec = head;

        while (sec != null) {
            if (sec.next != null) {
                sec = sec.next.next;
                one = one.next;
            } else {
                break;
            }
        }

        return one;
    }
}
