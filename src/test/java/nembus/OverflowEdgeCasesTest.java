package nembus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OverflowEdgeCasesTest {
    private static Main main;

    @BeforeAll
    static void setup() {
        main = new Main();
    }

    @Test
    void integerOverflowShouldGiveIntegerMinValue() {
        assertEquals(Integer.MIN_VALUE, main.evalRPN("2147483647 1 +"));
    }

    @Test
    void integerOverflowShouldGiveIntegerMaxValue() {
        assertEquals(Integer.MAX_VALUE, main.evalRPN("-2147483648 1 -"));
    }
}
