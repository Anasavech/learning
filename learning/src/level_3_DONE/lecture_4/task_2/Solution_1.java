package level_3_DONE.lecture_4.task_2;

import java.util.Scanner;

/**
 * Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт.
 * Но она работает неправильно. Например, пятилетнего ребенка отправляют в институт!
 * Исправить программу несложно: достаточно в нужном месте поставить фигурные скобки.
 * <p>
 * <p>
 * Требования:
 * Программа должна считывать число c клавиатуры.
 * Программа должна использовать команду System.out.println() или System.out.print().
 * Если возраст меньше 18 и больше либо равен 6, нужно вывести только сообщение "нужно ходить в школу".
 * Если возраст больше либо равен 18, нужно вывести только сообщение "пора в институт".
 * Если возраст меньше 6, то ничего выводить не нужно.
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age > 6)
                System.out.println("нужно ходить в школу");
        } else {
            System.out.println("пора в институт");
        }

        if (age < 18 & age > 6) {
            System.out.println("нужно ходить в школу");
        } else if (age > 5) {
            System.out.println("Пора в институт");
        }

    }

    //ПРИМЕР
    // 1.1
    // if (age < 18 & age > 6 & age == 12)
    // true, true, false
    // false, true, true

    // 1.2
    // if (age < 18 && age > 6 && age == 12)
    // true, true, false
    // false
}

/**
 * DONE
 */
