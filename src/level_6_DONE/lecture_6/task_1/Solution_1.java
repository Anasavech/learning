package level_6_DONE.lecture_6.task_1;

/**
 * Создай треугольный массив, где значение каждого элемента — это сумма его индексов. Например:
 * array[7][3] = 7 + 3 = 10,
 * array[3][0] = 3 + 0 = 3.
 *
 * Выведи массив на экран в следующем виде:
 * 0
 * 1 2
 * 2 3 4
 * 3 4 5 6
 * 4 5 6 7 8
 * 5 6 7 8 9 10
 * ...
 * Числа в строке разделены пробелом.
 *
 * Задать треугольный массив можно следующим образом:
 * int[][] array = new int[10][];
 * array[0] = new int[1];
 * array[1] = new int[2];
 * array[2] = new int[3];
 * ...
 *
 * Требования:
 * В методе main(String[]) двумерный массив result заполни числами согласно условию.
 * Выведенный текст должен содержать 10 строк.
 * Выведенные числа должны соответствовать условию.
 */
public class Solution_1 {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                System.out.println(i);
                continue;
            } else {
                System.out.print(i + "\t");
            }

            int array = i + 1;
            result[i] = new int[array];

            for (int j = 1; j < result[i].length; j++) {
                result[i][j] = i + j;
                if (j == result[i].length - 1) {
                    System.out.print(result[i][j]);
                    System.out.println();
                } else {
                    System.out.print(result[i][j] + "\t");
                }
            }
        }
    }
}

/**
 * DONE
 */

