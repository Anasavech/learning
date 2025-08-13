package level_6_DONE.lecture_7.task_5;

import java.util.Arrays;

/**
 * Исправь работу метода main(String[]), который выводит в консоли true, если arrayFirst равняется arraySecond, иначе — false.
 *
 * Требования:
 * Если arrayFirst равняется arraySecond, то метод main(String[]) выводит в консоли true.
 * Если arrayFirst не равняется arraySecond, то метод main(String[]) выводит в консоли false.
 */

public class Solution_1 {
    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst,arraySecond));
    }
}
// Вопрос. Почему массив двумерный (arrayFirst = new int[][]), а значение в нем я так понимаю 3ех мерное
// ({{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}). Я понимаю так, что одни кавычки {} - это один массив,
// { {}, {} } - два массива.
