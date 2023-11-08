package nembus;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormattingTest {
    private static Main rpnEvaluator;

    @BeforeAll
    static void init() {
        rpnEvaluator = new Main();
    }

    @Test
    void emptyExpressionThrowsException() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> rpnEvaluator.evalRPN(""),
                "Expected IllegalArgumentException to be thrown, but it hasn't been"
        );

        assertTrue(thrown.getMessage().contains("expression is empty"));

        thrown = assertThrows(
                IllegalArgumentException.class,
                () -> rpnEvaluator.evalRPN("   "),
                "Expected IllegalArgumentException to be thrown, but it hasn't been"
        );

        assertTrue(thrown.getMessage().contains("expression is empty"));
    }

    @Test
    void expressionWithoutOperatorsThrowsException() {
        String expression = "15 4 1 89 9";
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> rpnEvaluator.evalRPN(expression),
                "Expected IllegalArgumentException to be thrown, but it hasn't been"
        );

        assertTrue(thrown.getMessage().contains("badly formatted expression"));
    }

    @Test
    void expressionWithoutOperandsThrowsException() {
        String expression = "+ - / *";
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> rpnEvaluator.evalRPN(expression),
                "Expected IllegalArgumentException to be thrown, but it hasn't been"
        );

        assertTrue(thrown.getMessage().contains("badly formatted expression"));
    }
}
