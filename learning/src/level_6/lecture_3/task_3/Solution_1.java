package level_6_DONE.lecture_3.task_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Чтобы выполнить эту задачу, тебе нужно:
 *
 * Ввести с клавиатуры число N.
 * Считать N целых чисел и заполнить ими массив.
 * Найти минимальное число среди элементов массива и вывести в консоль.
 * Требования:
 * В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов
 * и заполни числами с клавиатуры.
 * В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
 */
public class Solution_1 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}

/**
 * DONE
 */
