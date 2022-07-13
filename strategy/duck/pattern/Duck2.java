package strategy.duck.pattern;

public class Duck2 extends Duck {

    public Duck2() {
        quackBehavior = new MuteQuack();
    }
}
