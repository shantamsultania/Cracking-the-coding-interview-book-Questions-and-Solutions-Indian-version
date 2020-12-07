import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @Test
    void test1()
    {
        Q1 obj = new Q1();
        int []a = {2,3,3,2};
        obj.insert(a);
        obj.delete_duplicate2();
        obj.print_all();
    }

}