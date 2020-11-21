import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    void Test1() {
        Q2 obj = new Q2();

        assertTrue(obj.checkm1("abcd","dabc"));


    }

    @Test
    void TEST2()
    {
        Q2 obj = new Q2();

        assertTrue(obj.checkm1("","dabc"));

    }

    @Test
    void TEST3()
    {
        Q2 obj = new Q2();

        assertFalse(obj.checkm1("abcd","abc"));

    }


    @Test
    void TEST4()
    {
        Q2 obj = new Q2();

        assertTrue(obj.checkm1("a","aaaasdahdkahdaldjaajlalaidjada"));

    }


    @Test
    void TEST5()
    {
        Q2 obj = new Q2();

        assertFalse(obj.checkm1("shantam","dabc"));

    }



}