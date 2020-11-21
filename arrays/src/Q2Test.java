import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    void Test1() {
        Q2 obj = new Q2();

        assertTrue(obj.checkm1("abcd","dabc"));
    }

    @Test
    void Test2()
    {
        Q2 obj = new Q2();

        assertFalse(obj.checkm1("shantam","dabc"));
    }

    @Test
    void test3()
    {
        Q2 obj = new Q2();

        assertFalse(obj.checkm1("abcd",""));
    }

    @Test
    void test4()
    {
        Q2 obj = new Q2();

        assertFalse(obj.checkm1("abcd","aaaa"));
    }
    @Test
    void test5()
    {
        Q2 obj = new Q2();

        assertFalse(obj.checkm1("efgh","dabc"));
    }



}