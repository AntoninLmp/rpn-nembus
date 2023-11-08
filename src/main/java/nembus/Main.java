package nembus;

import java.util.*;

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
                        if (y == 0)
                            throw new ArithmeticException("/ by zero");
                        result = x / y;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                stack.push(result);
            } else if (token.equals("sqrt")) {
                int x = stack.pop();
                int result = (int) Math.sqrt(x);
                stack.push(result);
            } else if (token.equals("max")) {
                ArrayList<Integer> array = new ArrayList<Integer>();
                while(!stack.isEmpty()){
                    if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                        array.add(stack.pop());
                    }
                }
                return Collections.max(array);
            } else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
  
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.evalRPN("4 20 + 9 14 9 max"));
    }
}
