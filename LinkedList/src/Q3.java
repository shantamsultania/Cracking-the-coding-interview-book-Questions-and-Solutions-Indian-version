import java.util.ArrayList;

public class Q3 {

    // delete middle node form the Linked List

    // Given a singly linked list, delete middle of the linked list. For example,
    // if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5
    // 1-2-3-4-5
    // 1-2-4-5

    ListNode head;
    Q3()
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

    ArrayList<Integer> printall()
    {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while (temp != null)
        {
            a.add(temp.data);
            temp = temp.next;
        }
        return a;
    }


    void deletemiddle()
    {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;
        while (slow.next != null && fast != null && fast.next != null)
        {
            pre = slow;
          slow = slow.next;
          fast = fast.next.next;

        }
        System.out.println(" Middle element is : "+slow.data);
        pre.next = slow.next;
    }

}
