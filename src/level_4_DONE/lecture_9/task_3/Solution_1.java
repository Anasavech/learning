package level_4_DONE.lecture_9.task_3;

import java.util.Scanner;

/**
 * Для решения этой задачи нужно:
 *
 * Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
 * Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
 * Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения
 * (отбросить дробную часть, округлив вниз до целого числа).
 * В качестве значения pi используй 3.14.
 *
 * Пример ввода:
 * 5
 *
 * Пример вывода:
 * 78
 *
 * Требования:
 * Программа должна считывать целое число c клавиатуры.
 * Программа должна выводить число на экран.
 * Программа должна выводить на экран площадь круга радиусом radius, приведенную к целому числу.
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double pi = 3.14;
        int integer = (int) Math.floor(pi * radius * radius);

        System.out.print(integer);
    }
}

/**
 * DONE
 */
