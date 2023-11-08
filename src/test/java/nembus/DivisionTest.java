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
}
