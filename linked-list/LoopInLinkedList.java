import java.util.HashSet;

public class LoopInLinkedList {

    public static void main(String[] args) {
        ListNode head = ListNode.create(null, 1);
        head = ListNode.create(head, 2);
        head = ListNode.create(head, 2);
        head = ListNode.create(head, 2);
        head = ListNode.create(head, 3);
        head = ListNode.create(head, 2);
        head = ListNode.create(head, 4);
        // ListNode.print(head);

        // ListNode t_head = head;
        // while (t_head.next != null) {
        //     t_head = t_head.next;
        // }
        // t_head.next = head.next;

        // System.out.println("\n" + findLoop(head));
        // System.out.println(floydDetectLoop(head));
        // ListNode.print(head);

        ListNode.print(RemoveDuplicatesFromLL.removeDuplicates(head));

    }

    public static boolean findLoop(ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        ListNode t_head = head;
        while (t_head.next != null) {
            if (set.contains(t_head.data))
                return true;
            set.add(t_head.data);
            t_head = t_head.next;
        }

        return false;
    }

    public static boolean floydDetectLoop(ListNode head) {
        if (head == null) return false;
        if (head.next == head) return true;

        ListNode fast, slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    if (slow.next == fast.next) {
                        fast.next = null;
                        return true;
                    }
                    slow = slow.next;
                    fast = fast.next;
                }
                return true;
            }
        }
        return false;
    }
}
