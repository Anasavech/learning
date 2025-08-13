package level_4.lecture_3.task_4;

/**
 * Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
 * размером 10 (высота) на 20 (ширина) из букв 'Б'.
 * Незаполненная часть состоит из пробелов.
 * <p>
 * Пример вывода:
 * ББББББББББББББББББББ
 * Б                  Б
 * Б                  Б
 * Б                  Б
 * Б                  Б
 * Б                  Б
 * Б                  Б
 * Б                  Б
 * Б                  Б
 * ББББББББББББББББББББ
 * <p>
 * Требования:
 * Программа должна выводить текст на экран.
 * Программа должна выводить контур прямоугольника высотой 10 и шириной 20 из буквы 'Б'.
 * В программе необходимо использовать вложенные циклы while (цикл в цикле).
 * Вывод на экран должен происходить в цикле while.
 */
/* public class Solution_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        while (a <= 10) {
            if (a == 1 || a == 10) {
                System.out.println();
                while (b < 20) {
                    System.out.print("Б");
                    b++;
                }
            } else {
                //Найди другой способ, например, если (a > 0 && a < 10) && (b > 1 && b < 20), тогда напишу пробел

                System.out.println();
                System.out.print("Б");
                System.out.print("                  ");
                System.out.print("Б");
            }
            b = 0;
            a++;
        }

    }
}
 */
    // другой способ

public class Solution_2 {
        public static void main(String[] args) {
            int a = 0;
            while (a < 10) {
                int b = 0;
                while (b < 20) {
                    if (a == 0 || a == 9 || b == 0 || b == 19)
                        System.out.print("Б");
                    else
                        System.out.print(" ");
                    b++;
                }
                System.out.println();
                a++;
            }
        }
    }



/**
 * DONE*
 */