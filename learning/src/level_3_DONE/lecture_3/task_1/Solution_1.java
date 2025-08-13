package level_3_DONE.lecture_3.task_1;

import java.util.Scanner;

/**
 * Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно",
 * иначе - вывести надпись "на улице тепло".
 *
 * Требования:
 * Программа должна считывать значение температуры c клавиатуры.
 * Программа должна использовать команду System.out.println() или System.out.print().
 * Если температура меньше 0, вывести только сообщение "на улице холодно".
 * Если температура больше либо равна 0, вывести только сообщение "на улице тепло".
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("На улице холодно");
        }
        else {
            System.out.print("На улице тепло");
        }

        // ПРИМЕРЫ
        //1.1
        if (temperature < 0) {
        }
        //1.2
        if (temperature < 0) {
        } else if (temperature == 0) {
        }
        //1.3
        if (temperature < 0) {
        } else if (temperature == 0) {
        } else {
        }
        //1.4
        if (temperature < 0) {
        } else {
        }
    }

    /**
     * DONE
     */
}
