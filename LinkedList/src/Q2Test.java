import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {



    @Test
    void test1()
    {
        //   35->15->4->20
        //   k = 4 output = 35
        //
        Q2 obj = new Q2();
        int []a = {35,15,4,20};
        obj.insert(a);
        assertEquals(20,obj.getKthnode(9));
        assertEquals(35,obj.getKthnode(8));
        assertEquals(4,obj.getKthnode(10));
    }

}