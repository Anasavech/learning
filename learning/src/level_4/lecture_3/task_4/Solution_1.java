package level_4.lecture_3.task_4;

/**
 * Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник
 * размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
 *
 * Пример вывода:
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 *
 * Требования:
 * Программа должна выводить текст на экран.
 * Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
 * В программе необходимо использовать вложенные циклы while (цикл в цикле).
 * Вывод на экран должен происходить в цикле while.
 */
public class Solution_1 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 5) {
            int b = 0;
            while (b < 10) {
                System.out.print("Q");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}

/**
 * DONE
 */
