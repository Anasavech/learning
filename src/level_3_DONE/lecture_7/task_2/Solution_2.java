package level_3_DONE.lecture_7.task_2;

import java.util.Scanner;

/**
 * Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
 * Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
 * Перепиши программу без использования тернарного оператора.
 *
 * Требования:
 * Программа должна считывать число c клавиатуры.
 * Вместо тернарного оператора в программе должен быть использован оператор if.
 * Функционал программы не должен измениться.
 */
public class Solution_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 5) {
            System.out.println("число меньше пяти");
        }
        else if (number > 5) {
            System.out.println("число больше пяти");
        }
        else {
            System.out.println("число равно пяти");
        }
    }

    /**
     * DONE
     */
}
