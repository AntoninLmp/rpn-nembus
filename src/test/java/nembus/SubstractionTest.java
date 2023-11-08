package nembus;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubstractionTest {

    @AfterAll
    static void afterAll() {

    }

    @Test
    void substraction2NumbersResultIsPositive() {
        String expression = "42 15 -";
        Main main = new Main();
        int result = main.evalRPN(expression);
        assertEquals(27, result);
    }

    @Test
    void substraction2NumbersResultIsNegative() {
        String expression = "42 100 - 25 -";
        Main main = new Main();
        int result = main.evalRPN(expression);
        assertEquals(-83, result);
    }
    
    @Test
    void substraction2NumbersResultIs0() {
        String expression = "42 42 -";
        Main main = new Main();
        int result = main.evalRPN(expression);
        assertEquals(0, result);
    }

    @Test
    void substractionNNumbers() {
        int random = (int) (Math.random() * 1000);
        int count = 0;
        String expression = "";
        for (int i = 0; i < random; i++) {
            int random2 = (int) (Math.random() * 100);
            expression += random2 + " ";
            if (i == 0) {
                count = random2;
            } else {
                count -= random2;

                if (i != random - 1)
                {
                    expression += "- ";
                } else {
                    expression += "-";
                }
            }
        }
        System.out.println(expression);
        Main main = new Main();
        int result = main.evalRPN(expression);
        assertEquals(count, result);
    }

    @Test
    void itDoesNotWork() {
    }
}