package interpreter;

public class Interpreter {
    public static int evaluate(String expression) {
        String[] tokens = expression.split(" ");
        Expression result = new NumberExpression(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            Expression nextExpression = new NumberExpression(Integer.parseInt(tokens[i + 1]));
            result = new OperationExpression(result, nextExpression, operator);
        }

        return result.interpret();
    }

    public static void main(String[] args) {
        String input = "5 + 2 - 3";
        System.out.println("Result: " + evaluate(input));  // Output: 4
    }
}
