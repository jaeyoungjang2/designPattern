package strategy.duck.pattern;

public class Duck3 extends Duck {

    public Duck3() {
        quackBehavior = new MuteQuack();
    }
}

