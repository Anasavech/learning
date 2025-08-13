package level_4.lecture_5.task_2;

import java.util.Scanner;

/**
 * Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
 * например, строка или символ. Выведи на экран максимальное четное число из введенных.
 * Если введено несколько таких чисел, необходимо вывести любое из них.
 *
 * Пример ввода:
 * 8
 * 9
 * 8
 * 4
 * 5
 * e
 *
 * Пример вывода:
 * 8
 * Требования:
 * Программа должна считывать числа c клавиатуры.
 * Программа должна выводить число на экран.
 * Программа должна выводить на экран максимальное четное из введенных целых чисел.
 * Если введено несколько максимальных четных чисел, необходимо вывести любое.
 * Если среди введенных символов нет четного числа или введен только один не числовой символ,
 * то вывести на экран минимальное значение числа типа int.
 * Считывать данные с клавиатуры необходимо в цикле while.
 */
public class Solution_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int greatestEvenNumber = Integer.MIN_VALUE;
        int result = 0;

        if (scanner.hasNextLine() || scanner.nextInt() % 2 != 0) {
            result = greatestEvenNumber;
        }
        while (scanner.hasNextInt()) {
            int evenNumber = scanner.nextInt();
            if (evenNumber % 2 == 0) {
                if (evenNumber > greatestEvenNumber) {
                    greatestEvenNumber = evenNumber;
                    result = greatestEvenNumber;
                }

                //исправила
            }
        }
        System.out.println(result);
    }
}

/**
 * DONE
 */


