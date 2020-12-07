import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q5Test {

    @Test
    void test1()
    {
        // 6 1 7
        // 2 9 5
        // 9 1 2

        Q5 obj = new Q5();
        Integer []a = {7,1,6};
        obj.insert1(a);
        Integer []b = {5,9,2};
        obj.insert2(b);
        Integer [] r = {2,1,9};
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(r));
        obj.sumList();
        assertEquals(res,obj.printall());
    }

}