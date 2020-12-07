import java.util.ArrayList;
import java.util.List;

public class Q7 {

    // find a cycle in a linked List
    // detecting a cycle in Linked List

    ListNode head;
    Q7()
    {
        head = null;
    }
    void  insert(Integer []a)
    {
        head = insert(head,a);
    }

    ListNode insert(ListNode head,Integer []a)
    {
        head = new ListNode(a[0]);
        ListNode temp = head;

        for(int i=1;i<a.length;i++)
        {
            temp.next = new ListNode(a[i]);
            temp = temp.next;

        }

        return head;
    }

    int detect_cycle()
    {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null &&fast.next != null)
        {
            if (slow.data == fast.data)
            {
                return slow.data;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return -1;
    }





}
