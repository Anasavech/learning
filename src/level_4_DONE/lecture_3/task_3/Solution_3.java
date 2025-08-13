package level_4_DONE.lecture_3.task_3;

import java.util.Scanner;

/**
 * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
 * пока пользователь не введет слово "ENTER".
 * Вывести на экран полученную сумму и завершить программу.
 *
 * Требования:
 * Программа должна считывать данные c клавиатуры.
 * Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
 * В программе необходимо использовать цикл while.
 */

public class Solution_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        boolean isExit = false;

        while (!isExit) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                summa = summa + x;

            } else if (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (s.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(summa);
    }
}


/**
 * DONE
 * НА любое слово выводит сумму, а не на ENTER
 */
