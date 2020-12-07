import java.util.HashSet;
import java.util.Iterator;

public class Q1 {

    // write a program to remove duplicates from a unsorted Linked List

    // 1->2->3->1->3->2;
    //
    // 1->2->3;
    ListNode head;
    Q1()
    {
        head = null;
    }
    void insert(int a[])
    {
        head = insert(a,head);
    }
    ListNode insert(int a[],ListNode head)
    {
        head = new ListNode(a[0]);
        ListNode temp = head;
        for (int i=1;i<a.length;i++)
        {
            temp.next = new ListNode(a[i]);
            temp = temp.next;
        }
        return head;


    }
    void print_all()
    {
        ListNode temp = head;
        while (temp!= null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    void delete_dublicate()
    {
       head =  delete_dublicate(head);
    }
    ListNode delete_dublicate(ListNode head)
    {

        HashSet<Integer> hs = new HashSet<>();
        ListNode temp = new ListNode(0);
        ListNode n1 = temp;
        while (head != null)
        {
            if (hs.contains(head)) {
                continue;
            } else {
                hs.add(head.data);
            }
            head = head.next;
        }

        for (Integer n : hs) {
            n1.next = new ListNode(n);
            n1 = n1.next;
        }
        n1.next = null;
        head = temp.next;
        return head;


    }


    void delete_duplicate2()
    {
        head = delete_dublicate2(head);
    }
    ListNode delete_dublicate2(ListNode head)
    {
        ListNode temp = head;
        HashSet<Integer> hs = new HashSet<>();
        ListNode pre = null;
        while (temp != null)
        {
            if (hs.contains(temp.data))
            {
                pre.next = temp.next;
            }
            else
            {
                hs.add(temp.data);
                pre = temp;
            }
            temp = temp.next;
        }
        return head;
    }


}
