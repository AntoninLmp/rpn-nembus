package nembus;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public int evalRPN(String expression) {
        // Divide the string
        String[] tokens = expression.split(" ");
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int y = stack.pop();
                int x = stack.pop();
                int result;

                switch (token) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = x - y;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    case "/":
                        result = x / y;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                stack.push(result);
            } else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }

    public void main(String[] args) {
        System.out.println(evalRPN("4 2 +"));
    }
}
