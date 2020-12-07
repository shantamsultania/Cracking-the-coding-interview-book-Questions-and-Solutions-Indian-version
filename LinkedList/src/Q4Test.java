import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q4Test {


    @Test
    void test1()
    {
        //Input : 1->4->2->10
        //        x = 3
        //Output: 1->2->4->10
        Q4 obj = new Q4();
        Integer []a = {1,4,2,10};
        obj.insert(a);
        Integer [] r = {1,2,4,10};
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(r));
        obj.partition(3);
        assertEquals(res,obj.printall());
    }
    @Test
    void test2()
    {
        //Input : 1->4->2->10
        //        x = 3
        //Output: 1->2->4->10
        Q4 obj = new Q4();
        Integer []a = {1,4,3,2,5,2,3};
        obj.insert(a);
        Integer [] r = {1,2,2,3,3,4,5};
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(r));
        obj.partition(3);

        assertEquals(res,obj.printall());
        res = obj.printall();
        for (Integer i : res) {
            System.out.print(i+" ");
        }
    }

    @Test
    void test3()
    {
        //Input : 1->4->2->10
        //        x = 3
        //Output: 1->2->4->10
        Q4 obj = new Q4();
        Integer []a = {1,4,3,2,5,2,3};
        obj.insert(a);
        Integer [] r = {1,2,2,3,3,4,5};
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(r));
        obj.partition(3);
        assertEquals(res,obj.printall());
        res = obj.printall();
        for (Integer i : res) {
            System.out.print(i+" ");
        }
    }

}