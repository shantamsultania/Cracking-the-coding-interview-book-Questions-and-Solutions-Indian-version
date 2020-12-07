import java.util.ArrayList;

public class Q8 {

    ListNode head;
    Q8()
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


    boolean isPlallendrome()
    {
        String s = new String();
        ListNode temp = head;

        while (temp != null)
        {
            s += temp.data;
            temp = temp.next;
        }

        int i=0;
        int j= s.length()-1;
       while (i <= j)
       {
           if (s.charAt(i) != s.charAt(j))
           {
               return false;
           }
           i++;
           j--;
       }
       return true;

    }


}
