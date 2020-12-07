import java.util.Stack;

public class Q2 {

    //
    //
    //
    //  implement an algorithm to find kth element from last of linked list
    //
    //  Original List : ->1->2->8->3->7->0->4
    //  Output : 3rd Element from the end is : 7
    //   35->15->4->20
    //   k = 4 output = 35
    //


    ListNode head;
    Q2()
    {
        head = null;
    }
    void  insert(int a[])
    {
        head = insert(head,a);
    }

    ListNode insert(ListNode head,int []a)
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

    void printall()
    {
        ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.data +"  ");
            temp = temp.next;
        }
    }

    int getKthnode(int k )
    {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
       int len = 0;
        while (temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
            len ++;
        }
        // k = 3
        int ans = 0;
        // k = 5 , l = 4
        if (k > len)
        {
            if (k  % len != 0)
            k = k%len;
            else
            {
                k=len;
            }
        }
        while(!stack.isEmpty() && k != 0)
        {
            ans = stack.pop();
            k--;
        }
       return ans;


    }



}
