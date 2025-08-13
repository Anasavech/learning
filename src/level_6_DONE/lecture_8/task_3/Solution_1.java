package level_6_DONE.lecture_8.task_3;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

/**
 * Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result.
 * Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
 * Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
 * При тестировании значения полей класса Solution будут разными, учти это.
 *
 * Требования:
 * Реализуй метод main(String[]) согласно условию.
 */

public class Solution_1 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {

        if (array.length % 2 != 0) {
            result[0] = Arrays.copyOfRange(array, 0, (array.length / 2 + 1));
            result[1] = Arrays.copyOfRange(array, (array.length / 2 + 1), array.length);

            System.out.println(deepToString(result));
        } else {
            System.out.println("Длина массива четная");
        }
    }
}

/**
 * DONE
 */
