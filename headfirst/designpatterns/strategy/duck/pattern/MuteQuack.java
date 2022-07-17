package headfirst.designpatterns.strategy.duck.pattern;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("-무음-");
    }
}
