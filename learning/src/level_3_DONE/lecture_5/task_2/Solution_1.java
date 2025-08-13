package level_3_DONE.lecture_5.task_2;

import java.util.Scanner;

/**
 * Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том, что температура тела высокая,
 * низкая или нормальная, в зависимости от условий.
 * В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
 * в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные.
 *
 * Требования:
 * Программа должна считывать значение температуры c клавиатуры.
 * Не изменяй объявление переменных isHigh и isLow.
 * Переменным isHigh и isLow в методе main должны быть присвоены соответствующие выражения сравнения.
 * Вместо выражений сравнения в операторах if () должны быть использованы переменные isHigh и isLow.
 * Функционал программы не должен измениться.
 */

public class Solution_1 {

    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {

        // еле как переделала, получилось, но я полностью не понимаю как так работает boolean

        Scanner console = new Scanner(System.in);
        double bodytemperature = console.nextDouble();

        isHigh = bodytemperature > 37;
        isLow = bodytemperature < 36;

        if (isHigh) {
            System.out.println("высокая температура");
        } else {
            System.out.println("высокая низкая");
        }
    }
}

/**
 * DONE
 */

