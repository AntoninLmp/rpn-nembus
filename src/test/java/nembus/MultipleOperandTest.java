package nembus;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleOperandTest {
    private static Main main;

    @BeforeAll
    static void setup() {
        main = new Main();
    }

    @Test
    void AdditionSubstraction() {
        assertEquals(3, main.evalRPN("5 5 + 7 -"));
    }
    
    @Test
    void AdditionMultiply() {
        assertEquals(20, main.evalRPN("5 5 + 2 *"));
    }

    @Test
    void AdditionDivision() {
        assertEquals(5, main.evalRPN("5 5 + 2 /"));
    }

    @Test
    void SubstractionMultiply() {
        assertEquals(6, main.evalRPN("5 2 - 2 *"));
    }

    @Test
    void SubstractionDivision() {
        assertEquals(1, main.evalRPN("5 2 - 3 /"));
    }

    @Test
    void MultiplyDivision() {
        assertEquals(5, main.evalRPN("5 5 * 5 /"));
    }

    @Test
    void AdditionSubstractionMultiply() {
        assertEquals(16, main.evalRPN("5 5 + 2 - 2 *"));
    }

    @Test
    void AdditionSubstractionDivision() {
        assertEquals(4, main.evalRPN("5 5 + 2 - 2 /"));
    }

    @Test
    void AdditionMultiplyDivision() {
        assertEquals(5, main.evalRPN("5 5 + 2 * 4 /"));
    }

    @Test
    void SubstractionMultiplyDivision() {
        assertEquals(2, main.evalRPN("5 2 - 2 * 3 /"));
    }

    @Test
    void AdditionSubstractionMultiplyDivision() {
        assertEquals(5, main.evalRPN("5 5 + 5 - 2 * 2 /"));
    }

}