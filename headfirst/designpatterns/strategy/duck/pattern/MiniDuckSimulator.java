package headfirst.designpatterns.strategy.duck.pattern;



public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new Duck2();
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
