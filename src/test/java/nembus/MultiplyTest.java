package nembus;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {
    private static Main main;

    @BeforeAll
    static void setup() {
        main = new Main();
    }

    @Test
    void multiplyShouldGive25() {
        assertEquals(25, main.evalRPN("5 5 *"));
    }

    @Test
    void multiplyShouldGive0() {
        assertEquals(0, main.evalRPN("0 5 *"));
    }

    @Test
    void multiplyShouldGiveNegative25() {
        assertEquals(-25, main.evalRPN("-5 5 *"));
    }

    @Test
    void multipliesShouldGive125() {
        assertEquals(125, main.evalRPN("5 5 * 5 *"));
    }
}