import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @Test
    public void test1() {

        Q1 obj = new Q1();
        assertFalse(obj.isUnique("aaaa"));
    }

    @Test
    void test2() {

        Q1 obj = new Q1();
        assertFalse(obj.isUnique("shantam"));
    }

    @Test
    void test3() {

        Q1 obj = new Q1();
        assertFalse(obj.isUnique("NITIN"));
    }

    @Test
    void test4() {

        Q1 obj = new Q1();
        assertTrue(obj.isUnique("aA"));
    }
    @Test
    void test5()
    {
        Q1 obj = new Q1();
        assertFalse(obj.isUnique(" "));
        assertTrue(obj.isUnique("siya"));
        assertTrue(obj.isUnique("jhon"));
        assertTrue(obj.isUnique("coding"));
        assertTrue(obj.isUnique("BANGIng"));
    }
}