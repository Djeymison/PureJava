package Diogof.Strategy;

public class Bot {
    private Behavior strategy;

    public void setStrategy(Behavior strategy) {
        this.strategy = strategy;
    }
    public void move() {
        strategy.move();
    }
}
