package interpreter;

public class OperationExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private char operation;

    public OperationExpression(Expression left, Expression right, char operation) {
        this.leftExpression = left;
        this.rightExpression = right;
        this.operation = operation;
    }

    @Override
    public int interpret() {
        switch (operation) {
            case '+':
                return leftExpression.interpret() + rightExpression.interpret();
            case '-':
                return leftExpression.interpret() - rightExpression.interpret();
            default:
                throw new UnsupportedOperationException("Unsupported operation: " + operation);
        }
    }
}
