import java.util.ArrayList;
import java.util.List;

public class Q5 {


    // 1 st digit is in last
    //
    // 7-1-6 = 617
    // 5-9-2 = 295
    // 2-1-9 = 912

    // 6 1 7
    // 2 9 5
    // 9 1 2


    ListNode head,head1,head2;
    Q5()
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

    // 6 1 7
    // 2 9 5
    // 9 1 2


    void sumList()
    {
        ListNode temp1 = new ListNode(0);
        ListNode temp = temp1;


        int carry = 0;
        int x,y =0;

        while (head1 != null || head2 != null)
        {
            if (head1 != null)
            {
                x = head1.data;
            }
            else
            {
                x = 0;
            }
            if (head2 != null)
            {
                y = head2.data;
            }
            else
            {
                y = 0;
            }

            int sum = x+y+carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            if (head2 != null)
            {
                head2 = head2.next;
            }
            if (head1 != null)
            {
                head1 = head1.next;
            }

        }
        if (carry != 0)
        {
            temp.next = new ListNode(carry);
        }
        head = temp1.next;


    }

}
