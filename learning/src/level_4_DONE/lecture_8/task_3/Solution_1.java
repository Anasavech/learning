package level_4_DONE.lecture_8.task_3;

import java.util.Scanner;

/**
 * В этой задаче нужно:
 *
 * Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
 * Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
 * Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
 * Пример ввода:
 * абв
 * 2
 *
 * Пример вывода:
 * абв
 * абв
 *
 * Требования:
 * Программа должна считывать данные c клавиатуры.
 * Программа должна выводить данные на экран.
 * Программа должна выводить на экран строку number раз.
 * Программа должна выводить на экран строку один раз, если число number меньше/равно 0 или больше/равно 5.
 * В программе необходимо использовать цикл do-while.
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int number = scanner.nextInt();
        do {
            System.out.println(s);
            number--;
        } while (number > 0 && number <= 3);
    }
}

/**
 * DONE
 */
