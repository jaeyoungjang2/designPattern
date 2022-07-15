package headfirst.designpatterns.strategy.duck.pattern;

public class Duck1 extends Duck {

    public Duck1() {
        quackBehavior = new Quack();
    }
}
