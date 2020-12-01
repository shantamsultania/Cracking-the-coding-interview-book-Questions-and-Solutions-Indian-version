import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q5Test {


    @Test
    void test1()
    {
        Q5 obj = new Q5();
        assertEquals("a2b2c5a3",obj.compressor1("aabbcccccaaa"));
    }
    @Test
    void test2()
    {
        Q5 obj = new Q5();
        assertEquals("a2b2c2d2a2",obj.compressor1("aabbccddaa"));
    }

}