import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesFromLL {

    public static ListNode removeDuplicates(ListNode head) {

        HashSet<Integer> set = new HashSet<Integer>();
        
        ListNode t_head = head;
        System.out.print("init t_head ");
        ListNode.print(t_head);
        set.add(t_head.data);

        while(t_head.next != null) {

            if(set.add(t_head.data)) t_head.next = t_head.next.next;
            else ;

            t_head = t_head.next;
        }

        System.out.println("set: " + set);

        System.out.print("dest t_head: ");
        ListNode.print(head);
        return head;
    }
}
