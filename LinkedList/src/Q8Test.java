import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q8Test {
    @Test
    void test1()
    {
        Q8 obj = new Q8();
        Integer []a = {1,2,1};
        obj.insert(a);
        assertTrue(obj.isPlallendrome());
    }
    @Test
    void test2()
    {
        Q8 obj = new Q8();
        Integer []a = {1,2};
        obj.insert(a);
        assertFalse(obj.isPlallendrome());
    }
    @Test
    void test3()
    {
        Q8 obj = new Q8();
        Integer []a = {1,1};
        obj.insert(a);
        assertTrue(obj.isPlallendrome());
    }
}