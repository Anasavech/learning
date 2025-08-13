package inheritance_test.test;

import inheritance_test.Mammals;

public class Human extends Mammals {
    public void thinking(String think) {
        System.out.println("Я думаю, что - " + think);
    }
}
