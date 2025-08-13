package level_2.lecture_8.task_5;

import java.util.Scanner;

/**
 * Считай с клавиатуры три целых числа. Выведи на экран их среднее арифметическое.
 * Пример ввода: 50 101 201
 * Пример вывода: 117
 * Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
 * Используй деление без остатка.
 */
public class Solution_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        System.out.println((a + b + c) / 3);
    }

    /** DONE
     *
     */
}