package level_4.lecture_6.task_3;

import java.util.Scanner;

/**
 * В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
 * Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно),
 * кратных multiple.
 * Для этого используй цикл for.
 * Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.
 *
 * Требования:
 * Программа должна вывести в консоль сумму чисел от start (включительно) до end (не включительно), кратных multiple.
 * В программе необходимо использовать цикл for.
 * В цикле for необходимо использовать оператор continue.
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0)
                continue;
            sum += i;
        }
        System.out.print(sum);
    }
}

//1, 2, 3, 4, 5, 6, 7, 8, 9
//2 = 2 + 4 + 6 + 8
//20

/**
 * DONE
 */
