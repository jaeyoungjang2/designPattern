package strategy.duck.pattern;

public abstract class Duck {
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;


    }
}
