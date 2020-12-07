import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q6Test {


    @Test
    void test1()
    {
        Q6 obj = new Q6();
        Integer a[] = {3,6,9,15,30};
        Integer b[] = {10,15,30};
        obj.insert1(a);
        obj.insert2(b);
        assertEquals(15,obj.getintersectionNode());
    }

    @Test
    void test2()
    {
        Q6 obj = new Q6();
        Integer []a = {1,2,3,4,5,6,7};
        Integer []b = {10,9,8,4,5,6,7};
        obj.insert1(a);
        obj.insert2(b);
        assertEquals(4,obj.getintersectionNode());
    }

}