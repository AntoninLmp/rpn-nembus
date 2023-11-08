package nembus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AdditionTest {
    private static Main main;

    @BeforeAll
    static void setup() {
        main = new Main();
    }

    @Test
    void additionTestShouldReturn10() {
        int result = main.evalRPN("6 4 +");
        Assertions.assertEquals(10, result);
    }

    @Test
    void additionTestShouldReturn28() {
        int result = main.evalRPN("20 8 +");
        Assertions.assertEquals(28, result);
    }
    
    @Test
    void multiplesAdditionTestShouldReturn30() {
        int result = main.evalRPN("12 8 + 10 +");
        Assertions.assertEquals(30, result);
    }
}
