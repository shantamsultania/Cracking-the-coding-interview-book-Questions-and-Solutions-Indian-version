import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q7Test {



    @Test
    void test1()
    {
        Q7 obj = new Q7();
         String s1 = "waterbottel";
         String s2 = "erbottelwat";
        assertTrue(obj.isrotate(s1,s2));
    }
}