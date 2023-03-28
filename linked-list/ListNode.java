
public class ListNode {
    int data;
    ListNode next;

    ListNode() {}
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public static ListNode create(ListNode head, int data) {

        ListNode t_head = new ListNode(data);
        if (head == null) {
            return t_head;
        }
        ListNode tail = head;
        while (tail.next != null)
            tail = tail.next;
        tail.next = t_head;
        return head;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode t_head = reverse(head.next);

        head.next = null;
        ListNode tt_head = t_head;
        while (tt_head.next != null) {
            tt_head = tt_head.next;
        }
        tt_head.next = head;
        return t_head;
    }

    public static void print(ListNode head) {
        ListNode t_head = head;
        while (t_head != null) {
            System.out.print(t_head.data + " ");
            t_head = t_head.next;
        }
    }
}