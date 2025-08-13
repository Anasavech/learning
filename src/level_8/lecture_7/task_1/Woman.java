package level_8.lecture_7.task_1;

/**
 * Построй правильную цепочку наследования классов.
 * Женщина должна наследоваться от человека, а человек от землянина.
 *
 * Требования:
 * Класс Woman должен наследоваться от класса Human.
 * Класс Human должен наследоваться от класса Terran.
 */
public class Woman {
    public static void main(String[] args) {
        Terran terran = new Terran();
        Human human = new Human();

        System.out.println("Чтобы посадить, нужно: ");
        System.out.print(terran.seeds + "(семян), ");
        System.out.print(terran.rake + "(грабли), ");
        System.out.println(human.jugWotter + "(шт кувшина с водой)");
    }
}
