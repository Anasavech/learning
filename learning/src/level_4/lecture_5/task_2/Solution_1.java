package level_4.lecture_5.task_2;

import java.util.Scanner;

/**
 * Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
 * например, строка или символ. Выведи на экран минимальное число из введенных. Если введено несколько таких чисел,
 * необходимо вывести любое из них.
 *
 * Пример ввода:
 * 8
 * 4
 * 9
 * 4
 * 5
 * e
 *
 * Пример вывода:
 * 4
 * Требования:
 * Программа должна считывать числа c клавиатуры.
 * Программа должна выводить число на экран.
 * Программа должна выводить на экран минимальное из введенных целых чисел.
 * Если введено несколько минимальных чисел, необходимо вывести любое.
 * Если введен только один нечисловой символ, то вывести на экран максимальное значение числа типа int.
 * Считывать данные с клавиатуры необходимо в цикле while.
 */

public class Solution_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String с;

        while (scanner.hasNextInt()) {
            int b = scanner.nextInt();
            a = Math.min(b, a);
        }
        if (scanner.hasNext()) {
            с = scanner.next();
            a = (с.length() == 1) ? Integer.MAX_VALUE : a;
        }
        System.out.print(a);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = Integer.MAX_VALUE; //
//
//        while (scanner.hasNextInt()) {
//            int inputNumber = scanner.nextInt();
//            number = Math.min(inputNumber, number);
//        }
//
//        if (scanner.hasNextLine()) {
//            System.out.println(number);
//        }
//    }
}

/**
 * NOT DONE
 */

