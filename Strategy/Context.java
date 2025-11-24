// package Strategy;

public class Context {
    private OperationStrategy strategy;

    public Context(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a, int b) {
        return strategy.execute(a, b);
    }
}

