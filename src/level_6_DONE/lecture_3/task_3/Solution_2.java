package level_6_DONE.lecture_3.task_3;

import java.util.Scanner;

/**
 * В этой задаче тебе нужно:
 * <p>
 * Ввести с клавиатуры число N.
 * Считать N целых чисел и заполнить ими массив array.
 * Найти максимальное число среди элементов массива.
 * Требования:
 * В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов,
 * и заполни числами с клавиатуры.
 * В методе main(String[]) выведи в консоль максимальное число среди элементов массива.
 */

public class Solution_2 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

/**
 * DONE
 */