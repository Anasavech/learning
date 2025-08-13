package level_8.lecture_2.task_5;

/**
 * Реализуй метод setValues(long value), чтобы он устанавливал полученное значение параметра value переменным a, b, c и d.
 * Изменять типы переменных a, b, c и d нельзя.
 *
 * Требования:
 * Типы переменных a, b, c и d не должны измениться.
 * Метод setValues(long value) должен устанавливать полученное значение переменным a, b, c и d.
 */

public class Solution_1 {

    public static void main(String[] args) {

        Installer installer = new Installer();

        installer.setValue(100);

        System.out.print("Значения переменных: a, b, c, d - ");
        System.out.println(Installer.a);
    }
}
