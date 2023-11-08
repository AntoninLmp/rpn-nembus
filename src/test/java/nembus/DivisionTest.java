package nembus;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    private static Main rpnEvaluator;

    @BeforeAll
    static void init() {
        rpnEvaluator = new Main();
    }

    @Test
    void expression8dividedBy2Returns4() {
        String expression = "8 2 /";
        int result = rpnEvaluator.evalRPN(expression);
        assertEquals(4, result);
    }

    @Test
    void expression28dividedByNegative4DoesntReturn7() {
        String expression = "28 0 4 - /";
        int result = rpnEvaluator.evalRPN(expression);
        assertNotEquals(7, result);
        assertEquals(-7, result);
    }

    @Test
    void expression5dividedBy10DividedBy5Returns0() {
        String expression = "5 10 / 5 /";
        int result = rpnEvaluator.evalRPN(expression);
        assertEquals(0, result);
    }
}
