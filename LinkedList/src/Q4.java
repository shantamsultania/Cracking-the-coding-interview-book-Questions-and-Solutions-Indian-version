import java.util.ArrayList;
import java.util.List;

public class Q4 {

    // Given a linked list and a value x, partition
    // it such that all nodes less than x come first,
    // then all nodes with value equal to x and finally nodes with
    // value greater than or equal to x. The original relative order of
    // the nodes in each of the three partitions should be preserved. The partition must work in-place.
    //
    //Examples:
    //
    //Input : 1->4->3->2->5->2->3,
    //        x = 3
    //Output: 1->2->2->3->3->4->5
    //
    //Input : 1->4->2->10
    //        x = 3
    //Output: 1->2->4->10
    //
    //Input : 10->4->20->10->3
    //        x = 3
    //Output: 3->10->4->20->10


    ListNode head;
    Q4()
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

    //Input : 10->4->20->10->3
    //        x = 3
    //Output: 3->10->4->20->10

    void partition(int x)
    {
        ListNode temp = head;

        ListNode lesser = new ListNode(0);
        ListNode l1 = lesser;
        ListNode equal = new ListNode(0);
        ListNode e1 = equal;
        ListNode greater = new ListNode(0);
        ListNode g1 = greater;
        boolean flag = false;
        while (temp != null)
        {
            if (temp.data < x)
            {
                l1.next = new ListNode(temp.data);
                l1 = l1.next;
            }
            else if (temp.data == x)
            {
                flag = true;
                e1.next = new ListNode(temp.data);
                e1 = e1.next;
            }
            else
            {
                g1.next = new ListNode(temp.data);
                g1 = g1.next;

            }
            temp = temp.next;
        }
        if (flag) {
            l1.next = equal.next;
            e1.next = greater.next;
        }
        else
        {
            l1.next = greater.next;
        }
        head = lesser.next;


    }




}
