package level_6_DONE.lecture_4.task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В этой задаче тебе нужно:
 * <p>
 * Считать 6 строк и заполнить ими массив strings.
 * Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 * Примеры.
 * <p>
 * Массив после чтения строк:
 * {"Hello", "Hello", "World", "Java", "Tasks", "World"}
 * Массив после удаления повторяющихся строк:
 * {null, null, null, "Java", "Tasks", null}
 * <p>
 * Требования:
 * В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
 * В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
 */
public class Solution_1 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
            for (int q = 0; q < strings.length; q++) {

                if (i != q && strings[i] != null) {
                    if (strings[i].equals(strings[q])) {
                        strings[i] = null;
                        strings[q] = null;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}

/**
 * DONE
 */



