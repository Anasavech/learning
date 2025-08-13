package level_3_DONE.lecture_9.task_1;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 *
 * Требования:
 * Программа должна считывать две строки c клавиатуры.
 * Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
 * Если строки разные, то программа должна вывести сообщение "строки разные".
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}

/**
 * DONE
 */
