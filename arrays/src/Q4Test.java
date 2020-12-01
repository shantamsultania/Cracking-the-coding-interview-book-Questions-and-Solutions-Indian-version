import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q4Test {



    @Test
    void test1()
    {
        Q4 obj = new Q4();
        assertTrue(obj.is_edit_distance("",""));
    }


    @Test
    void test2()
    {
        Q4 obj = new Q4();
        assertTrue(obj.is_edit_distance("pale","ple"));
    }
    @Test
    void test3()
    {
        Q4 obj = new Q4();
        assertTrue(obj.is_edit_distance("pales","pale"));
    } @Test
    void test4()
    {
        Q4 obj = new Q4();
        assertTrue(obj.is_edit_distance("pale","bale"));
    } @Test
    void test5()
    {
        Q4 obj = new Q4();
        assertFalse(obj.is_edit_distance("pale","bake"));
    }

    @Test
    void test6()
    {
        Q4 obj = new Q4();
        assertFalse(obj.is_edit_distance("seeks","reaks"));

    }
}