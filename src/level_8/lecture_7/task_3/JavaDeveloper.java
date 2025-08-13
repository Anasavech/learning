package level_8.lecture_7.task_3;

/**
 * Правильно унаследуй классы:
 *
 * человека — от существа;
 * Java-девелопера — от человека.
 * Удали дублирующие методы.
 * Требования:
 * Класс Human должен наследоваться от класса Entity.
 * Класс JavaDeveloper должен наследоваться от класса Human.
 * Дублирующих методов не должно быть
 */

public class JavaDeveloper extends Human {

    public static void main(String[] args) {

        Human human = new Human();
        Human.speak();

        System.out.println("Я могу говорить на Java");
    }
}
