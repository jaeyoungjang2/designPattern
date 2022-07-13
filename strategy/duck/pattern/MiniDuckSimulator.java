package strategy.duck.origin;

import strategy.duck.origin.Duck;
import strategy.duck.origin.Duck2;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new Duck2();
        duck.display();
        duck.quack();
    }
}
