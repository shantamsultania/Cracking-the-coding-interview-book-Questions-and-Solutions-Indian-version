import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q7Test {


    @Test
    void test1()
    {

        Q7 obj = new Q7();
        Integer []a = {1,2,3,1};
        obj.insert(a);
        assertEquals(1,obj.detect_cycle());
    }

}