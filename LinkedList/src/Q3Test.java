import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {


    @Test
    void test1()
    {
        Q3 obj = new Q3();
        Integer []a = {1,2,3,4,5};
        obj.insert(a);
        Integer [] r = {1,2,4,5};
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(r));
        obj.deletemiddle();
        assertEquals(res,obj.printall());

    }
    @Test
    void test2()
    {
        Q3 obj = new Q3();
        Integer []a = {1,2,3,4,5,7,8};
        obj.insert(a);
        Integer [] r = {1,2,3,5,7,8};
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(r));
        obj.deletemiddle();
        assertEquals(res,obj.printall());

    }

}