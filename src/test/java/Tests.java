import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void Test1() {
        assertFalse(false);
    }
    @Test
    public void Test2() {
        assertTrue(true);
    }
    @Test
    public void Test3() {
        assertEquals(2, 1+1);
    }

}
