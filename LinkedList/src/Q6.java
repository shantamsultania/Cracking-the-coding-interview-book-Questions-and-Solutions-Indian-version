import java.util.ArrayList;
import java.util.List;

public class Q6 {

    // find intersection of 2 linked List

    //There are two singly linked lists in a system.
    // By some programming error, the end node of one of the linked list got
    //  linked to the second list, forming an
    // inverted Y shaped list. Write a program to get the point where two linked list merge.
    // 3-6-9-15-30
    // 10-15-30
    //The node of intersection is 15


    ListNode head1,head2;
    Q6()
    {
        head1 = null;
    }
    void  insert1(Integer []a)
    {
        head1 = insert(head1,a);
    }

    void  insert2(Integer []a)
    {
        head2 = insert(head2,a);
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

    void printall1()
    {
        ListNode temp = head1;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    void printall2()
    {
        ListNode temp = head2;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    int getcount(ListNode h)
    {
        int len = 0;
        while (h != null)
        {
            len++;
            h = h.next;
        }
        return len;
    }

    int getIntersection(int d,ListNode l1,ListNode l2)
    {

        while (l1 != null && d >0)
        {
            l1 = l1.next;
            d--;
        }

        while (l1 != null && l2 != null)
        {
            if (l1.data == l2.data)
            {
                return l1.data;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return -1;

    }

    int getintersectionNode()
    {
        int c1 = getcount(head1);
        int c2 = getcount(head2);
        int d = 0;
        if (c1 > c2)
        {
            d = c1-c2;
            return getIntersection(d,head1,head2);
        }
        else
        {
            d = c2 - c1;
            return getIntersection(d,head2,head1);
        }

    }



}
