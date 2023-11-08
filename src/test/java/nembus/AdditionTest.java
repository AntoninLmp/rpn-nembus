package nembus;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class AdditionTest {
    @Test
    void additionTestShouldReturn10(){
        Main main = new Main();
        int result = main.evalRPN("6 4 +");
        Assertions.assertEquals(10,result);
    }
    @Test
    void additionTestShouldReturn28(){
        Main main = new Main();
        int result = main.evalRPN("20 8 +");
        Assertions.assertEquals(28,result);
    }
}
