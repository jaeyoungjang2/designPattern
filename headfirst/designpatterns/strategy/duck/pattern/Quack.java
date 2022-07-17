package headfirst.designpatterns.strategy.duck.pattern;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
