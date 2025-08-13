package inheritance_test;


import inheritance_test.test.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.thinking("Земля круглая");

        Cow cow = new Cow();
        cow.getMilk();

        human.кормитьМолоком();
        cow.кормитьМолоком();
    }
}
