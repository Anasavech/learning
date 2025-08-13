package level_4.lecture_4.task_1;
/**
 * Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
 * Слово "enough" выводить не нужно.
 * Для этого необходимо использовать бесконечный цикл (while(true)).
 *
 * Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
 *
 * Требования:
 * Программа должна считывать данные c клавиатуры.
 * В программе необходимо использовать цикл while.
 * Для завершения бесконечного цикла необходимо использовать оператор break.
 * Программа должна выводить в консоли все введенные данные с новой строки, пока не будет введено слово "enough".
 */

import java.util.Scanner;

public class Solution_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            String s = console.nextLine();

            if (s.equals("enough"))
                break;
            else {
                System.out.println(s);
            }
        }
    }
}
/**
 * DONE
 */
