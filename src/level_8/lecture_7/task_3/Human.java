package level_8.lecture_7.task_3;

public class Human extends Entit {

    public static void speak() {
        System.out.println("Я умею говорить");

        Entit entit = new Entit();
        Entit.move();
        Entit.eat();
    }
}
