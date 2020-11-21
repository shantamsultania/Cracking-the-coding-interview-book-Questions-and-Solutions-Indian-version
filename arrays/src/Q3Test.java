import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void urlfy() {

        Q3 obj = new Q3();
        assertEquals("Mr%20john%20smith",obj.urlfy("Mr john smith      ",13));
    }
}